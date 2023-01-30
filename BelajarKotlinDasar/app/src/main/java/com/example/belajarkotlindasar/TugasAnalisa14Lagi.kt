package com.example.belajarkotlindasar

fun main(args: Array<String>) {
    val number = 4
    val factorial = fact(number)
    println("Faktorial dari $number = $factorial")
}

tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1){
        temp
    } else {
        fact(n-1, temp*n)
    }
}