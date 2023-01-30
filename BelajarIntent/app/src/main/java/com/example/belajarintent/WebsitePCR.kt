package com.example.belajarintent

import android.content.Intent
import android.net.Uri

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WebsitePCR : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website_pcr)
    }
    fun panggilWebsitekePCR(view: View?) {
        val i= Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://pcr.ac.id/"));
        startActivity(i);



    }
}