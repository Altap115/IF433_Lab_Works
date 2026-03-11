package oop_76981_DaffaAlthafMaulana_lec.Week06

interface Organisasi{
    val namaorg: String
    val budgetRapat: Int
    val jmlOrg: Int
    val biayaKonsumsi: Int
        get() = budgetRapat * jmlOrg

    fun rapat()
    fun keaktifan(){
        println("Ih kamu Aktif")
    }
}