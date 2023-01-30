package com.example.belajarkotlindasar

fun main(){
    val angkasatusepuluh = 1..10
    println("ada angka 5 kah antara 1-10? : ${5 in angkasatusepuluh} ")
    println("ada angka 11 kah antara 1-10? : ${11 in angkasatusepuluh}")

    val hurufAZ = 'a' .. 'z'
    println("ada huruf r kah antara a-z? : ${'r' in hurufAZ}")
    println("ada huruf ü kah antara a-z? : ${'ü' in hurufAZ}")

    for (angka :Int in 1..5){
        print(" "+angka)
    }
    println()

    val satuSampeLima = 1.rangeTo( 5)
    print("Rangenya 1-5: ")
    for (x in satuSampeLima){
        print(" "+x)
    }
    println()

    val tujuhKeDua = 7.downTo(2)
    print("Rangenya 7-2: ")
    for (y in tujuhKeDua){
        print(" "+y)
    }
}