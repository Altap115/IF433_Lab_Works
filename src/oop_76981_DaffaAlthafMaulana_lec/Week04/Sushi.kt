package oop_76981_DaffaAlthafMaulana_lec.Week04

class Sushi: Makanan() {
   private var jenis:String = ""
    public fun sushi_terjual(jns:String, jml: Int){
        this.jenis = jns
        harga = jml * 100
        println("Sushi $jenis laku $harga")
    }
}