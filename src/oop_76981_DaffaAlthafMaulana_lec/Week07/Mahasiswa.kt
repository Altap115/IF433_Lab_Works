package oop_76981_DaffaAlthafMaulana_lec.Week07

class Mahasiswa private constructor(val kampus: String) {
    companion object {
        var nama: String =  "Unknown"

        fun set_nilai(uts: Int, uas: Int): Int{
            return (uts + uas)/2
        }
        fun isi_nama_kampus(namaUniv: String) {
            Mahasiswa(namaUniv)
        }
    }
    //bagian class yang biasa
    init {
        println("Nama kampus kamu $kampus")
    }
}