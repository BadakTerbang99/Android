package com.example.myapplication

fun main() {
    print("Nama pegawai: ")
    val namaPegawai = readln()

    print("Gaji pokok: ")
    val gajiPokok = readln().toDouble()

    print("Tunjangan: ")
    val tunjangan = readln().toDouble()

    print("Uang lembur: ")
    val uangLembur = readln().toDouble()

    print("Potongan: ")
    val potongan = readln().toDouble()

    val gajiKotor = gajiPokok + tunjangan + uangLembur
    val gajiBersih = gajiKotor - potongan

    println()
    println("Nama pegawai : $namaPegawai")
    println("Gaji kotor : Rp$gajiKotor")
    println("Gaji bersih : Rp$gajiBersih")
}