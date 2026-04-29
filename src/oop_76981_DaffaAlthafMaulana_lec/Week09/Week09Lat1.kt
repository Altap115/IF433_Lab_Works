package oop_76981_DaffaAlthafMaulana_lec.Week09

fun main() {
   println ("==== LIST OF ====")
   val arSiswa = listOf("Budi","Danu", "Susi", "Cisca")

   println(arSiswa)

   println("Banyak siswa: " + arSiswa.size)

   println("Siswa bernama ${arSiswa[1]}")

    for(a in arSiswa) {
        print("Siswa" + a + "dan")
    }

    println ("==== LIST OF ====")
    val arMatkul = mutableListOf("OOP", "Pomweb", "Matdis" , "Kalkulus")
    arMatkul.add("Algo")
    arMatkul.remove("Pomweb")
    arMatkul[2] = "Aljabar Linear"
    println(arMatkul)

    println("==== SET OF IMUT ====")

    val arNilai = setOf(80, 90, 75, 85, 80, 30, 50 ,85)
    println("Banyak Nilai :  ${arNilai.size}")
    println("ada angka 90 tidak? ${arNilai.contains(90)}")
    println(arNilai)

    println("==== SET OF MUTABLE ===")

    val arMahasiswa = mutableSetOf("Andi", "Yantoo", "Udin", "Yuda")
    arMahasiswa.add("Yanti")
    arMahasiswa.remove("Udin")
    arMahasiswa.add("Udin")
    println(arMahasiswa)

    println("==== MAP IMUT ====")
    val arResto = mapOf(
        "Ayam" to 5000,
        "Bakpao" to 3000,
        "Sayur Asem" to 2500
    )
    println("Banyak menu ${arResto.size}")
    println("Harga Ayama ${arResto["Ayam"]}")
    println("List makanan ${arResto.keys}")
    println("List Harga ${arResto.values}")
    println(arResto)

    println("==== MAP IMUTABLE ====")

    val arKHS = mutableMapOf(
        "Tony" to 80,
        "Nika" to 85,
        "Ara" to 80,
        "Davin" to 90
    )
    arKHS.remove("Ara")
    arKHS["Nika"] = 92
    arKHS["Cinta"] = 99
    println(arKHS)


    println("==== LAMBDA ====")
    fun tambah(a: Int, b: Int): Int {
        return a + b
    }
    println("Hasil penambahan ${tambah(5,3)}")


    val kurang = {a:Int, b:Int -> a-b}
    println("Hasil pengurangan ${kurang(5,3)}")

    println("==== LAMBDA { IT } ====")
    val pangkat = {a:Int, b:Int -> a*b}
    val hasilPangkat:(Int)-> Int = {it * it}
    println("Hasil pangkat ${hasilPangkat(5)}")


    println("==== FOREACH BIASA ====")
    for (a in arMatkul)
        print(a)

    println("==== FOREACH IT ====")
    arMatkul.forEach {
        mk -> println(mk)
    }

    println("==== FOREACH VARIABLE ====")
    arMatkul.forEach {
        mk -> println(mk)
    }
}