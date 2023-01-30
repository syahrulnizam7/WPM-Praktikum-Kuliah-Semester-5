package com.example.belajarkotlindasar

fun main(){
    println("Contoh High Order 1")
    contohFungsi(kls= 3, fungsi = ::contohFungsi2)

    println("\nContoh High Order 2")
    val jumlah :(Int)->Int = contohFungsi3(nilai1 = 25)
    println("Hasil Penjumlahan 25 + 30 = ${jumlah(30)}")
}

fun contohFungsi(kls: Int, fungsi: (Int) -> Unit){
    print("Selamat kalian sudah berhasil naik ke kelas ")
    fungsi(kls)
}

fun contohFungsi2(kls: Int){
    println(kls)
}
/*-------------------------------------------------------------------*/
fun contohFungsi3(nilai1: Int): (Int) -> Int ={ nilai2 -> nilai2 + nilai1}