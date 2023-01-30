package com.example.belajarkotlindasar

fun main(){
    println("Index BMI : ${rumusBMI(54.0,1.4)}")
}

fun rumusBMI(berat: Double, tinggi: Double):Double{
    return berat/(tinggi*tinggi)
}