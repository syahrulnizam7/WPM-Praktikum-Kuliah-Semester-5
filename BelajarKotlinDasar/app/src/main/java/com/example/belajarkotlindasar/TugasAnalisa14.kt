package com.example.belajarkotlindasar

fun main(args: Array<String>) {
    print("Masukkan angka: ")
    val number: Int =Integer.valueOf(readLine())
    val factorial = fact(number)
    println("Faktorial dari $number = $factorial")
}

//recursive function
fun fact(num: Int): Int {
    return if(num == 1){
        num
    }
    else{
//function fact() calling itself
        num*fact(num-1)
    }
}