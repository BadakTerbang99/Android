package com.example.myapplication

fun main() {
    val nama = "Shella"
    val npm = "235314182"

    var semester = 5
    var ipk = 3.50

    println("Data sebelum diperbarui:")
    println("Nama : $nama")
    println("NPM : $npm")
    println("Semester : $semester")
    println("IPK : $ipk")

    semester = 6
    ipk = 3.65

    println()
    println("Data setelah diperbarui:")
    println("Nama : $nama")
    println("NPM : $npm")
    println("Semester : $semester")
    println("IPK : $ipk")
}