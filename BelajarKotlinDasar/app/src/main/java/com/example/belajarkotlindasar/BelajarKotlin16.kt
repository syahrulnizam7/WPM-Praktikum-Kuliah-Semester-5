package com.example.belajarkotlindasar

import java.lang.ArithmeticException
import com.example.belajarkotlindasar.contohError as contohError1

fun main() {
    println("Coba Exception Handling 1")

    try {
        val testError = 10/0
        println("Contoh Error")
        println(testError)
    } catch (e: ArithmeticException) {
        println("Arithmentic Exception")
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Pada block Finally, apapun itu yag terjadi ya tetap diprint")
    }

    println("\nCoba Exception Handling 2")
    contohError1()
}

fun contohError() {
    try {
        println("Sebelum Exception")
        throw Exception("Hayoooo masalahnya masuk ke Throw")
        println("Sesudah Exception")
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Masih error, tapi finally tetap muncul ya")
    }
}