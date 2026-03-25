package oop_76981_DaffaAlthafMaulana_lec.Week07

import javax.swing.plaf.basic.BasicTreeUI

fun main() {
    println("server: ${Koneksi.LinkServer}")
    Koneksi.test_koneksi()

    Mahasiswa.nama = "Udin"
    val na: Int = Mahasiswa.set_nilai(80, 100)
    println("Nilai ${Mahasiswa.nama} adalah $na")

    Mahasiswa.isi_nama_kampus("UMN")

    val dsn1 = Dosen("Indah", "12345", 2020)
    println(dsn1)
    val dsn2 = dsn1.copy("Budi", "322154")
    println(dsn2)
    // Cara Ambil Data satu2 field
    println("Nama Dosen1: ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}")

    println("Matkul favorite saya " + MataKuliah.OOP.name)
    println("Index matkul : " + MataKuliah.OOP.ordinal)
    MataKuliah.OOP.sks_matkul()

    //Looping munculin semua
    for(matkul in MataKuliah.entries) {
        print("matkul: " + matkul + " ")
        matkul.sks_matkul()
    }
}