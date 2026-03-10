package oop_76981_DaffaAlthafMaulana_lec.Week04

class Pasta: Makanan() {
    private var toping: String = ""
    public fun pata_terjual(jml: Int){
        this.toping = "Nora"
        this.harga = jml * 120
        println("Pasta $toping laris $harga")
    }
    override public fun jual_makanan() {
        println("Saya jual PASTA enak")
    }
}