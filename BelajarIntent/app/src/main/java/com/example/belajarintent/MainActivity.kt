package com.example.belajarintent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun panggilActivityKedua(view: View?) {
        val i = Intent(applicationContext, MainActivity2::class.java)
        i.putExtra("Value1","Belajar Android")
        i.putExtra("Value2", "Pemrograman Mobile")
        startActivity(i)
    }
}