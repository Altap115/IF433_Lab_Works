package oop_76981_DaffaAlthafMaulana_lec.Week12

// bac+sic Exceptions - TryCatch
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

fun main(){
    pembagian(10, 0)
}