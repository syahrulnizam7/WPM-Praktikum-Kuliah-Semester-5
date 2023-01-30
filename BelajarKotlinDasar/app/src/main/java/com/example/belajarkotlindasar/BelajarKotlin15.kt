package com.example.belajarkotlindasar

fun main() {
    println("Contoh Lambda 1")
    val jumlah = {nilai1: Int, nilai2: Int -> nilai1 / nilai2}
    println("Hasil dari 255:5 = ${jumlah(255, 5)}")

    println("\nContoh Lambda 2")
    val contohLambda: (String) -> Unit = {nama: String -> print("Nama saya : $nama")}
    val namaKu = "Muhammad Syahrul Nizam"
    contohLambda(namaKu)

    println("\n\nContoh Lambda 3")
    val myLambda: (String) -> Unit = {s: String -> print(s)}
    perkalian(15.3, 10.8, myLambda)
}

fun perkalian(angka1: Double, angka2: Double, myLambda:(String) -> Unit) {
    val hasil = angka1 * angka2
    val output = "Hasil perkalian dari $angka1 * $angka2 = $hasil"
    myLambda(output)
}