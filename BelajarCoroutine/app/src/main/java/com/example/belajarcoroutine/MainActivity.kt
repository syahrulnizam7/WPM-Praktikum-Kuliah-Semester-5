package com.example.belajarcoroutine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    private val HASIL_1 = "Hasil #1"
    private val HASIL_2 = "Hasil #2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_klik.setOnClickListener{
            CoroutineScope(IO).launch {
                reqDataAPI()
            }
        }
    }

    private suspend fun contohReqDataDariNetwork(): String {
        logThread("ContohReqDataDariNetwork")
        delay(1000)
        return HASIL_1
    }

    private suspend fun contohReqDataDariNetwork2(): String {
        logThread("ContohReqDataDariNetwork")
        delay(1000)
        return HASIL_2
    }

    private fun setTeks(input: String){
        val teks = txt_hasil.text.toString()+"\n$input"
        txt_hasil.text=teks
    }

    private suspend fun setTekspadaMainThread(input: String){
        withContext(Main){
            setTeks(input)
        }
    }

    private suspend fun reqDataAPI(){
        val hasil =contohReqDataDariNetwork()
        println("debug: $hasil")
        setTekspadaMainThread(hasil)

        val hasil2 =contohReqDataDariNetwork2()
        println("debug: $hasil2")
        setTekspadaMainThread(hasil2)
    }

    private fun logThread(methodName:String){
        println("debug: ${methodName}: ${Thread.currentThread().name}")
    }
}