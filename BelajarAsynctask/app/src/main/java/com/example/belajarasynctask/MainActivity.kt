package com.example.belajarasynctask

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import java.lang.ref.WeakReference
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var myVariable = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDoAsync.setOnClickListener{
            val task = MyAsyncTask(this)
            task.execute(10)
        }
    }
    companion object{
        class MyAsyncTask internal  constructor(context: MainActivity): AsyncTask<Int, String, String?>(){

            private var resp: String? = null
            private val activityReference: WeakReference<MainActivity> = WeakReference(context)

            override fun onPreExecute() {
                val activity = activityReference.get()
                if(activity == null || activity.isFinishing)return
                activity.progressBar.visibility = View.VISIBLE
            }

            override fun doInBackground(vararg params: Int?): String? {
                publishProgress("Thread mulai berhenti")
                try{
                    val time = params[0]?.times(100)
                    time?.toLong()?.let { Thread.sleep(it/2) }

                    publishProgress("Setengah jalan....")
                    time?.toLong()?.let { Thread.sleep(it/2) }

                    publishProgress("Thread aktif lagi")
                    resp = "Andorid beristirahat selama " + params[0] + " detik"
                } catch (e: InterruptedException){
                    e.printStackTrace()
                    resp = e.message
                }catch (e: Exception){
                    e.printStackTrace()
                    resp = e.message
                }
                return resp
            }

            override fun onPostExecute(result: String?) {
                val activity = activityReference.get()
                if(activity == null || activity.isFinishing)return
                activity.progressBar.visibility = View.GONE
                activity.textView.text = result.let{ it }
                activity.myVariable = 100
            }

            override fun onProgressUpdate(vararg text: String?) {
                val activity = activityReference.get()
                if(activity == null || activity.isFinishing)return

                Toast.makeText(activity, text.firstOrNull(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}