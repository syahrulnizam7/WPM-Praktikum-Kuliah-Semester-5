package com.example.belajarhorizontalscrollview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var linearLayout: LinearLayout? = null
    private val menu = arrayOf("Compas", "light","TV","Radio","Tablet","Book","Focus","Global","Writing","Video")
    private val gambar = intArrayOf(R.drawable.kompas,R.drawable.light,R.drawable.tv,R.drawable.radio,R.drawable.tablet,
        R.drawable.book,R.drawable.focus,R.drawable.global,R.drawable.book,R.drawable.video)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayout = findViewById(R.id.linear1)
        val layoutInflater = LayoutInflater.from(this)

        for(i in menu.indices){
            val view: View =layoutInflater.inflate(R.layout.layout_utama,linearLayout, false)
            val imageView = view.findViewById<ImageView>(R.id.iv)
            imageView.setImageResource(gambar[i])
            val tv = view.findViewById<TextView>(R.id.tv)
            tv.text = menu[i]
            linearLayout?.addView(view)
        }
    }
}