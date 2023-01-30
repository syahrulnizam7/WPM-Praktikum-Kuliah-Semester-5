package com.example.belajarservice


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener{
            MyIntentService.enqueueWork(this,intent)
            txt_hasil.text = "Service Jalan"
        }

        btn_stop.setOnClickListener{
            MyIntentService.stopService()
            txt_hasil.text = "Service Berhenti"
        }
    }
}