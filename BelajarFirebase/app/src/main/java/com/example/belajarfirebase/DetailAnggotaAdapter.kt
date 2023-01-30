package com.example.belajarfirebase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class DetailAnggotaAdapter(
    val detailContext: Context,
    val layoutResId: Int,
    val detailList: List<DetailAnggota>
): ArrayAdapter<DetailAnggota>(detailContext, layoutResId, detailList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(detailContext)
        val view: View = layoutInflater.inflate(layoutResId, null)

        val tvAlamat = view.findViewById<TextView>(R.id.ou_alamat)
        val tvKodePos = view.findViewById<TextView>(R.id.ou_kodePos)

        val detail = detailList[position]
        tvAlamat.text = detail.alamat
        tvKodePos.text = detail.kodePos

        return view
    }
}