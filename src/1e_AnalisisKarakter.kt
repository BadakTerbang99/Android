package com.example.myapplication

fun main() {
    print("Masukkan karakter: ")
    val karakter = readln()[0]

    println("Karakter : $karakter")
    println("Kode karakter : ${karakter.code}")
    println("Termasuk huruf : ${karakter.isLetter()}")
    println("Termasuk angka : ${karakter.isDigit()}")
}