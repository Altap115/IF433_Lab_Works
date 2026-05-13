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

fun main(){
    // Exceptions - Expressions
    cek_tipe_data()
    pembagian(10, 0)
}