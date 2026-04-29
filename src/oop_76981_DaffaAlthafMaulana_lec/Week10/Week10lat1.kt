package oop_76981_DaffaAlthafMaulana_lec.Week10


// coe Non-Generic
class rumah(var alamat: Any)

//code Generic
class Kampus <T>(val alamat:T)

//code Generic - Multi Parameter
class Komputer<T, V>(val merk:T, val barcode:V)

//code Generic - Function
fun <T> Password(isiPass:T):T {
    return isiPass
}

fun main() {
    println("===== SAMPLE GENERIC - FFUNCTION =====")
    println("Password Kamu: " + Password("12345"))

    println("===== SAMPLE GENERIC - Multi Parameter =====")
    val komp = Komputer("Dell", 12345)
    println("Merk Komputer : " + komp.merk)
    println("Barcode Komputer : ${komp.barcode}")

    println("===== SAMPLE NON-GENERIC =====")
    val rmh = rumah(alamat = 200)
    val angkaRumah = rmh.alamat as Int
    println(angkaRumah + 50)

    println("===== SAMPLE GENERIC =====")
    val kmps = Kampus(alamat = 300)
    println(kmps.alamat + 50)
}