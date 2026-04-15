package oop_76981_DaffaAlthafMaulana_lec.Week08

class Alamat(val nomor: Int, val kota: String)
class mahasiswa(val nim: String, val addr: Alamat?)

fun main() {
    val almt = Alamat (47,"Tangerang")
    val mhs = mahasiswa("12345", almt)

    val defaultAlamat = mhs.addr?.let {
        alamatAsli -> "sini nih.... ${mhs.addr.kota} nomornya ${mhs.addr.nomor}"
    }?:"Gak jelas, gatau dimana"

    println("Nim-nya ${mhs.nim} tinggalnya di ${defaultAlamat}")
}