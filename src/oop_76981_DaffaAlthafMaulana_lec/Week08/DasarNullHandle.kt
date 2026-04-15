package oop_76981_DaffaAlthafMaulana_lec.Week08

class set_krs(val nim:String, val kodematkul:String?) {
    fun matkul_wajib(sks: Int?) {
        println("Matkul kamu adalah $kodematkul sksnya adalah $sks")
    }
}

fun main() {
    var nama: String? = "Wirawan"
    nama = null
    println("Hai $nama")

    val settingKRS = set_krs("123", null)
    println("Nim kamu ${settingKRS.nim} matkul kamu ${settingKRS.kodematkul}")
    settingKRS.matkul_wajib(null)


}