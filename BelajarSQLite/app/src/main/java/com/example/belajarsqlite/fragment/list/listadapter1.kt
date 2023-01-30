package com.example.belajarsqlite.fragment.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarsqlite.R
import com.example.belajarsqlite.model.Jadwal
import kotlinx.android.synthetic.main.custom_row.view.*

class listadapter1 : RecyclerView.Adapter<listadapter1.MyViewHolder>() {

    private var jadwalList = emptyList<Jadwal>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.custom_row, parent,
                false)
        )
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val curItem = jadwalList[position]
        holder.itemView.hari.text = curItem.hari
        holder.itemView.jam.text = curItem.waktu
        holder.itemView.nama_mk.text = curItem.mataKuliah
        holder.itemView.nama_dosen.text = curItem.namaDosen

        holder.itemView.cl_custom_row_layout.setOnClickListener{
            val aksi = ListFragmentDirections.actionFragmentListToFragmentUpdate(curItem)
            holder.itemView.findNavController().navigate(aksi)
        }
    }

    fun tampilkanData(jadwal: List<Jadwal>){
        this.jadwalList = jadwal
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return jadwalList.size
    }
}