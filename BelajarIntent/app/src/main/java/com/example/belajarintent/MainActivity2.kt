package com.example.belajarintent


import android.os.Bundle
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

class MainActivity2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)
        val extras: Bundle? = intent.extras
        val value1:String? = extras!!.getString("Value1")
        val value2:String? = extras.getString("Value2")
        Toast.makeText(applicationContext, """Value pertama adalah :
        |First value : $value1
        |Value kedua adalah: $value2 """, Toast.LENGTH_LONG).show()
    }

    fun panggilActivityPertama(view: View?) {
        val i = Intent(applicationContext, MainActivity::class.java)
        startActivity(i)
    }
}