package com.example.belajarfirebase

data class DetailAnggota(
    val id: String,
    val alamat: String,
    val kodePos: String
) {
    constructor(): this("", "", "")
}