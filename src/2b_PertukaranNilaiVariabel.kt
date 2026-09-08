package com.example.myapplication

fun main() {
    print("Masukkan nilai A: ")
    var a = readln().toInt()

    print("Masukkan nilai B: ")
    var b = readln().toInt()

    println()
    println("Sebelum ditukar:")
    println("A = $a")
    println("B = $b")

    val sementara = a
    a = b
    b = sementara

    println()
    println("Setelah ditukar:")
    println("A = $a")
    println("B = $b")
}