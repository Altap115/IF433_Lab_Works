package oop_76981_DaffaAlthafMaulana_lec.Week07

enum class MataKuliah(val jmlSKS: Int) {
    OOP(3),
    GAMEDEV(4),
    DASPRO(2);

    fun sks_matkul() {
        println("Jml sksnya : $jmlSKS")
    }
}