package oop_76981_DaffaAlthafMaulana_lec.Week10


// coe Non-Generic
class rumah(var alamat: Any)

//code Generic
class Kampus <T>(val alamat:T)


fun main() {
    println("===== SAMPLE NON-GENERIC =====")
    val rmh = rumah(alamat = "Gading Serpong")
    println(rmh.alamat)

    println("===== SAMPLE GENERIC =====")
    val kmps
}