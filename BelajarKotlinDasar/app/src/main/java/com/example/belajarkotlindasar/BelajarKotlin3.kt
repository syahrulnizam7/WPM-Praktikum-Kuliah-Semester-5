package com.example.belajarkotlindasar

fun main() {
    val kataMutable: MutableList<String> = mutableListOf("Hai", "Halo", "Aloha")
    println("List yang menggunakan Mutable " + kataMutable)

    kataMutable.add("Hi")
    kataMutable.removeAt(0)

    println("List mutable setelah ditambahkan " + kataMutable)
    println("List mutable setelah dihapus " + kataMutable)

    kataMutable.shuffle()
    println("List mutable setelah dishuffle " + kataMutable)

    val kataImmutable: List<String> = kataMutable
    println(kataImmutable)

    println("Kata pertama dari mutable : " + kataImmutable.first())

    val cobaSet = setOf("Belajar", "Pemrograman", "Mobile")
    println("Set : " + cobaSet)

    val cobaMap = mapOf(1 to "Muhammad", 2 to "Syahrul Nizam", 3 to "3SIA")
    println("Map : " + cobaMap.values)
}