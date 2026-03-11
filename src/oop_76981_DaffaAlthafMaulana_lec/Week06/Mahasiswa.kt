package oop_76981_DaffaAlthafMaulana_lec.Week06

class Mahasiswa(override val namaorg: String, override val budgetRapat: Int, override val jmlOrg: Int, override val nilaiMk: Int, override val namaMK: String): Organisasi, KelasMK {
    override fun rapat() {
        println("Sedang rapat di $namaorg")
        println("Biaya Konsum rapat: ${super.biayaKonsumsi}")
    }
    override fun penilaian() {
        println("Nilai $namaMK adalah $nilaiMk")
    }
    override fun keaktifan() {
        super<KelasMK>.keaktifan()
        super<Organisasi>.keaktifan()
    }
}