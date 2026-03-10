package oop_76981_DaffaAlthafmaulana.Week05

fun Main() {
    val dosen1 = Dosen ("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------")
    }
}

fun main() {

    println("===== TEST MATH HELPER =====")

    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(4)
    val luasPersegiPanjang = mathHelper.hitungLuas(5, 3)
    val luasLingkaran = mathHelper.hitungLuas(7.0)

    println("Luas Persegi: $luasPersegi")
    println("Luas Persegi Panjang: $luasPersegiPanjang")
    println("Luas Lingkaran: $luasLingkaran")
}