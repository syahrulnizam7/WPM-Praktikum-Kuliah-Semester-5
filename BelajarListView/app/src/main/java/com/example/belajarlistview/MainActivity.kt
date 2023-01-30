package com.example.belajarlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val mataPelajaran = arrayOf(
        "Matematika",
        "Pemprograman Mobile",
        "Agama",
        "Bahasa Inggris",
        "Jaringan Dasar",
        "pengembangan Game",
        "Animasi",
        "pemprograman Web",
        "Konsep Teknologi Informasi",
        "Sistem Operasi",
        "Aljabar matriks",
        "Pengembangan Game",
        "Animasi",
        "Pemprograman Web",
        "Konsep Teknologi Informasi",
        "Sistem Operasi",
        "Aljabar Matriks",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, mataPelajaran)
        listView.adapter = arrayAdapter

        listView.setOnItemClickListener{parent: AdapterView<*>?, view:View?,
                                        posisi: Int, id: Long ->
            Toast.makeText(
                this, "Klik id: "+(posisi+1)+" "+
                        mataPelajaran[posisi], Toast.LENGTH_SHORT
            ).show()
        }
    }
}