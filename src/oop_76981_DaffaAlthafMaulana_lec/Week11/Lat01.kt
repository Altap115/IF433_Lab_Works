package oop_76981_DaffaAlthafMaulana_lec.Week11

import oop_76981_DaffaAlthafMaulana_lec.Week06.Mahasiswa
import oop_76981_DaffaAlthafMaulana_lec.Week08.mahasiswa

fun Panggil_Nama(nama: String):String {
    return "Hai $nama"
}

// Function Extension - BASIC
fun String.Panggil_Mahasiswa():String {
    //return "Hello $this"
    var hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar {
            c -> c.uppercase()
        }
    }
    return hasil
}

fun Int.tentukanlulus(nama: String): String{
    var keputusan = ""
    if(this >= 70) {
        keputusan = "LULUS"
    } else {
        keputusan = "REMEDIAL"
    }
    return "Mahasiswa $nama hasil kelulusan adalah $keputusan"
}

//Function Extension - cek Null
fun String?.cekNulldanEmpty():String {
    if(this == null || this.isEmpty()) {
        return "gak boleh null atau kosong bang"
    } else {
        return "Username kamu adalah $this"
    }
}

class Mahasiswa() {
    var nim:String = ""
    var nama:String = ""
    var ipk:Int = 0
}

fun main () {
    //cara panggil function extension - Null
    var inputusername: String? = null
    println(inputusername.cekNulldanEmpty())

    //cara panggil function Extension - Parameter
    println(80.tentukanlulus("Revan"))

    // cara panggil function biasa
    println(Panggil_Nama("Toni").uppercase())

    //cara panggil function Extension - BASIC
    println("tonnyyy stark ironman".Panggil_Mahasiswa())

    //SCOPE - LET
    var kampusSaya = "UMN"
    kampusSaya.let {
        if (it =="UMN"){
            println("Kampus " + it + "keren")
        } else {
            println("Amazing + $it")
        }
    }
    //SCOPE - RUN
    var alamatSaya = "Gading Serpong"
    alamatSaya.run {
        println("Saya tinggal di " + this)
    }

    //SCOPE - WITH
    var gradeSaya = with(90){
        if(this >= 80){
            "A"
        } else {
            "C"
        }
    }
    println("Grade kamu adalah $gradeSaya")

    //SCOPE - APPLY
    var dataMahasiswa = Mahasiswa().apply {
        nim = "12345"
        nama = "Yudi"
        ipk = 3
    }
    println("Mahasiswa ${dataMahasiswa.nama} dgn ${dataMahasiswa.nim} ipknya ${dataMahasiswa.ipk}")

    //SCOPE - ALSO
    var deretAngka = mutableListOf<Int>(80,70,75,68,85)
    deretAngka.also {
        println("sebelum $deretAngka")
    }.add(90)
    println("Setelah $deretAngka")
}

