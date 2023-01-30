package com.example.belajarrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var dosenAdapter: DosenRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        tambahDataSet()
    }

    private fun tambahDataSet() {
        val data = SumberData.buatSetData()
        dosenAdapter.submitList(data)
    }

    private fun initRecyclerView() {
        recycle_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val spacingAtas = DekorasiSpasiGambar(28)
            addItemDecoration(spacingAtas)
            dosenAdapter = DosenRecyclerAdapter()
            adapter = dosenAdapter
        }
    }
}