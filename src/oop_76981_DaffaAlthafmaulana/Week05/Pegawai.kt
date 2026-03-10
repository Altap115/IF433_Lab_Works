package oop_76981_DaffaAlthafmaulana.Week05

abstract class Pegawai (val nama: String) {
    abstract fun bekerja()
}

class Dosen(nama: String, val nidn: String): Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS")
    }

    fun mengajar() {
        println("[$nama] sedang mengajar di kelas")
    }
}