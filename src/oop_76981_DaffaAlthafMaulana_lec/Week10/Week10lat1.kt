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

//code Generic - Functiona ada Constraint
class Kalkulator<T: Number>(val a:T, val b:T){
    fun tambah(): Int {
        return a.toInt() + b.toInt()
    }
    fun kurang(): Double {
        return a.toDouble() - b.toDouble()
    }
}

//Generic - Where
fun <T> penilaian(list: List<T>, kkm:T):List<T> where T: Comparable<T> {
    return list.filter { it >= kkm }.sorted()
}

fun main() {
    println("===== SAMPLE GENERIC - Where =====")
    val daftarNilai = listOf(60, 71, 90, 83, 73, 63 ,55, 84, 72)
    println("Daftar Nilai: " + daftarNilai)
    val nilaiAtasKKM = penilaian(daftarNilai, 70)
    println("Nilai diatas KKM: " + nilaiAtasKKM)

    println("===== SAMPLE GENERIC - FFUNCTION CONSTRAINT =====")
    val kalk = Kalkulator(10, 20.347)
    println("Penambahan ${kalk.a} ditambah ${kalk.b} : " + kalk.tambah())
    println("Pengurangan ${kalk.a} dikurang ${kalk.b} : " + kalk.kurang())

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