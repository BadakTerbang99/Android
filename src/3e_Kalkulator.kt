package com.example.myapplication

fun tambah(a: Double, b: Double): Double {
    return a + b
}

fun kurang(a: Double, b: Double): Double {
    return a - b
}

fun kali(a: Double, b: Double): Double {
    return a * b
}

fun bagi(a: Double, b: Double): Double {
    return a / b
}

fun main() {
    print("Masukkan angka pertama: ")
    val a = readln().toDouble()

    print("Masukkan angka kedua: ")
    val b = readln().toDouble()

    println()
    println("Pilih operasi:")
    println("1. Penjumlahan")
    println("2. Pengurangan")
    println("3. Perkalian")
    println("4. Pembagian")

    print("Pilihan: ")
    val pilihan = readln().toInt()

    println()

    when (pilihan) {
        1 -> println("Hasil : ${tambah(a, b)}")
        2 -> println("Hasil : ${kurang(a, b)}")
        3 -> println("Hasil : ${kali(a, b)}")
        4 -> {
            if (b == 0.0) {
                println("Error: Tidak dapat melakukan pembagian dengan nol.")
            } else {
                println("Hasil : ${bagi(a, b)}")
            }
        }
        else -> println("Pilihan tidak valid.")
    }
}