package com.example.belajarkotlindasar

fun main() {
    val jumlah = { nilai1: Int, nilai2: Int -> nilai1 + nilai2 }
    println("Hasil dari 10 + 3 = ${jumlah(10, 3)}")

    val nama = {
            nama :String, tempatLahir: String -> println("Halo, namaku $nama. " + "Aku lahir di $tempatLahir")
    }

    nama("Nizam", "Bagansiapiapi")
}