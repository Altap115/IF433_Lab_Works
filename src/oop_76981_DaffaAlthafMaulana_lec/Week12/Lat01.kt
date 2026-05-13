package oop_76981_DaffaAlthafMaulana_lec.Week12

// Basic Exceptions - TryCatch
fun pembagian (pembilang: Int, penyebut: Int) {
    try {
        val hasilbagi = pembilang / penyebut
        println("Hasil bagi: $hasilbagi")
    } catch (e: Exception) {
        println("Error di Pembagian: ${e.message}")
    } finally {
        println("Selesai Pembagian")
    }
}

// Exceptions - Expression - Tipe data

fun cek_tipe_data () {
    var angka:Int = try {
        Integer.parseInt("10")
    } catch (e: Exception){
        println("ada error di CekTipeData ${e.message}")
        111
    }
    println("angka kamu adalah : ${angka}")
}

// Throw
fun cek_saldo(sadoSaya: Int){
    if(sadoSaya < 1000) {
        throw IllegalArgumentException ("Saldo ${sadoSaya} tidak perlu bayar pajak")
    } else {
        println("Selamat kamu orang kaya")
    }
}

fun main(){
    // Throw
    try {
        cek_saldo(990)
    } catch (e: Exception){
        println("Error di Throw: ${e.message}")
    }

    // Exceptions - Expressions
    cek_tipe_data()

    // Exceptions basic
    pembagian(10, 0)
}