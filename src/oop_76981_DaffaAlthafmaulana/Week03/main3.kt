package oop_76981_DaffaAlthafmaulana.Week03

fun main() {

    val player = Player("ShadowKnight")

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")
}