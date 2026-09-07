package com.example.myapplication

fun main() {
    // Meminta input suhu Celsius dari pengguna
    print("Masukkan suhu Celsius: ")
    val celsius: Double = readln().toDouble()

    // Menghitung konversi suhu
    val fahrenheit: Double = (celsius * 9 / 5) + 32
    val kelvin: Double = celsius + 273.15

    // Menampilkan hasil
    println()
    println("=== HASIL KONVERSI SUHU ===")
    println("Celsius    : $celsius °C")
    println("Fahrenheit : $fahrenheit °F")
    println("Kelvin     : $kelvin K")
}