package com.example.belajarkotlindasar

fun main() {
    namaKu()
    contohReturn("Nizam", 20)
    println("Ini hasil dari function Jumlah : ${jumlah(5, 10, 15, 20)}")
}

fun namaKu() {
    println("Muhammad Syahrul Nizam")
}

fun contohReturn(nama: String, umur: Int) {
    println("Halo, namaku $nama. Umurku $umur tahun")
}

fun jumlah(vararg angka: Int): Int {
    var hasilJumlah = 0
    angka.forEach { nilai -> hasilJumlah += nilai }

    return hasilJumlah
}