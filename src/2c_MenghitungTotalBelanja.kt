package com.example.myapplication

fun main() {
    print("Nama barang: ")
    val namaBarang = readln()

    print("Harga barang: ")
    val harga = readln().toDouble()

    print("Jumlah barang: ")
    val jumlah = readln().toInt()

    print("Diskon (%): ")
    val diskon = readln().toDouble()

    val subtotal = harga * jumlah
    val potongan = subtotal * diskon / 100
    val totalBayar = subtotal - potongan

    println()
    println("Nama barang : $namaBarang")
    println("Subtotal : Rp$subtotal")
    println("Potongan : Rp$potongan")
    println("Total bayar : Rp$totalBayar")
}