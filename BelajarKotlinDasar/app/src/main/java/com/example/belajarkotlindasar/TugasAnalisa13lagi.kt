package com.example.belajarkotlindasar

fun main(){
    val RumusBMI = {berat: Double, tinggi: Double -> berat / (tinggi*tinggi) }
    println("Index BMI : ${RumusBMI(54.0, 1.4)}")
}