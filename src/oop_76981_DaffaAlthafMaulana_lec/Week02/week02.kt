package oop_76981_DaffaAlthafMaulana_lec.Week02

class Pemain {
    var nama:String = "Tidak Terdaftar";
    var speed:Int = 9;
    val shoot : Int = 8;

    init {
        this.nama = "Messi"
        println("ini adalah constructor")
    }

    constructor(alias: String="Budi", kecepatan: Int=2) {
        nama = alias
        speed = kecepatan
        println("ini constructor kedua")
    }

    fun bawa_bola() {
        println("Si $nama sedang bawa bola");
    }
}

fun main (){
    val player = Pemain(alias= "Yoel", kecepatan=100)
    player.bawa_bola()
    println("nama pemain: ${player.nama}")
    println("skill Kecepatan: ${player.speed}")

    val player2 = Pemain(alias= "Ronaldo", kecepatan=99)
    println("nama pemain: ${player2.nama}")
    println("Kecepatan:" +  player2.speed)
}