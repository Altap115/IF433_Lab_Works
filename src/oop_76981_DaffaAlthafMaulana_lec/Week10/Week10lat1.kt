package oop_76981_DaffaAlthafMaulana_lec.Week10


// coe Non-Generic
class rumah(var alamat: Any)

//code Generic
class Kampus <T>(val alamat:T)


fun main() {
    println("===== SAMPLE NON-GENERIC =====")
    val rmh = rumah(alamat = 200)
    val angkaRumah = rmh.alamat as Int
    println(angkaRumah + 50)

    println("===== SAMPLE GENERIC =====")
    val kmps = Kampus(alamat = 300)
    println(kmps.alamat + 50)
}