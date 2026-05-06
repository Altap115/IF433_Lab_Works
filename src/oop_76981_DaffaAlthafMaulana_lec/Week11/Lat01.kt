package oop_76981_DaffaAlthafMaulana_lec.Week11

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

}
