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

// Custom Exceptions
class CekNilaiKKM (val kkm: Int, val nilai: Int): Exception("Nilai $nilai berada di bawah kkm $kkm")

class nilai_siswa(val kkm: Int){
    fun input_nilai(nilaiKamu: Int){
        if (nilaiKamu < kkm){
            throw CekNilaiKKM(kkm, nilaiKamu)
        } else {
            println ("Kamu lulus, dengan nilai $nilaiKamu")
        }
    }
}

//multiple catch
fun contoh_multiple_catch(nilai: String){
    try {
        val angka = Integer.parseInt(nilai)
        val hasil = angka/2
        println("Hasil nilainya: $hasil")
        cek_saldo(100)
    } catch (e: NumberFormatException) {
        println("Error salah format ${e.message}")
    } catch(e: ArithmeticException){
        println("Error kesalahan aritmatika ${e.message}")
    } catch (e: Exception) {
        println("Error Program:  ${e.message}")
    }
}

sealed class ATMException(pesan:String): Exception(pesan)

class saldo_dibawah_nol (val saldoKamu: Int):
    ATMException("Masa saldo $saldoKamu minus")
class cek_jumlah_saldo (val saldoAwal: Int, val jajan: Int):
        ATMException("Saldo tinggal $saldoAwal kamu jajan $jajan, ga cukup bang")

fun mulai_jajan(SaldoAwalKamu: Int, jajanKamu: Int): Int {
    if (jajanKamu > SaldoAwalKamu) {
        throw cek_jumlah_saldo (SaldoAwalKamu, jajanKamu)
    } else if (SaldoAwalKamu<0) {
        throw saldo_dibawah_nol (SaldoAwalKamu)
    } else {
        println("Transaksi Berhasill")
    }
    return SaldoAwalKamu - jajanKamu
}

fun main(){
    runCatching { mulai_jajan(1000, 1200) }
        .onSuccess { println("Transaksi Sukses: $it") }
    .onFailure { println("Transaksi gagal: $it") }

    contoh_multiple_catch("100")

    //Panggil class custom Exceptions
    val nsiswa = nilai_siswa(70)
    try {
        nsiswa.input_nilai(60)
    } catch (e: Exception){
        println("ada error saat input nilai ${e.message}")
    }

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