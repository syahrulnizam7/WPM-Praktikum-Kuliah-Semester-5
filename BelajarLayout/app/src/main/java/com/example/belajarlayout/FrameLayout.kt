package com.example.belajarlayout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class FrameLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout)
    }

    fun onClick(v: View?){
        val btnKlik = findViewById<View>(R.id.btn_klik)
        btnKlik.visibility = View.GONE

        val txtTombol = findViewById<View>(R.id.txt_tombol)
        txtTombol.visibility = View.VISIBLE
    }
}