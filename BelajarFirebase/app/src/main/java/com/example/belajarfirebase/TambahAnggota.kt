package com.example.belajarfirebase

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*

class TambahAnggota : AppCompatActivity() {
    private lateinit var tvJudul: TextView
    private lateinit var edtAlamat: EditText
    private lateinit var edtKodePos: EditText
    private lateinit var btnSimpan: Button
    private lateinit var lvTambahDetail: ListView
    private lateinit var detailList: MutableList<DetailAnggota>
    private lateinit var ref: DatabaseReference

    companion object {
        const val EXTRA_ID = "extra_id"
        const val EXTRA_NAMA = "extra_nama"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_detail)

        tvJudul = findViewById(R.id.txt_judul_detail)
        edtAlamat = findViewById(R.id.edt_alamat)
        edtKodePos = findViewById(R.id.edt_kodePos)
        btnSimpan = findViewById(R.id.btn_tambahDetail)
        lvTambahDetail = findViewById(R.id.lv_tambahDetail)

        val id = intent.getStringExtra(EXTRA_ID)
        val nama = intent.getStringExtra(EXTRA_NAMA)

        detailList = mutableListOf()
        ref = FirebaseDatabase.getInstance().getReference("detail anggota")
            .child(id!!)

        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()){
                    detailList.clear()
                    for (a in snapshot.children){
                        val detail = a.getValue(DetailAnggota::class.java)
                        if (detail != null){
                            detailList.add(detail)
                        }
                    }
                    val adapter = DetailAnggotaAdapter(this@TambahAnggota,
                        R.layout.activity_item_detail, detailList)
                    lvTambahDetail.adapter = adapter

                    println("Output : " + detailList)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        btnSimpan.setOnClickListener {
            simpanDetail()
        }
    }
    private fun simpanDetail(){
        val alamat = edtAlamat.text.toString().trim()
        val kodePos = edtKodePos.text.toString()

        if(alamat.isEmpty()){
            edtAlamat.error = "Isi alamat terlebih dahulu"
            return
        }
        if(kodePos.isEmpty()){
            edtKodePos.error = "Isi kode pos terlebih dahulu"
            return
        }
        val detailId = ref.push().key

        val detail = DetailAnggota(detailId!!, alamat, kodePos)

        ref.child(detailId).setValue(detail).addOnCompleteListener{
            Toast.makeText(applicationContext, "Informasi tambahan berhasil ditambahkan",
                Toast.LENGTH_SHORT)
                .show()
        }
    }
}