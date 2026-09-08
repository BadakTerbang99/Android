package com.example.myapplication

fun tampilkanSalam(nama: String) {
    println("Selamat datang, $nama!")
}

fun main() {
    print("Masukkan nama: ")
    val nama = readln()

    tampilkanSalam(nama)
}