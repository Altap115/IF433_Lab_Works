package oop_76981_DaffaAlthafmaulana.Week03

fun main() {

    val weapon = Weapon("Excalibur")

    weapon.damage = -50      // Harus gagal
    println("Damage sekarang: ${weapon.damage}")

    weapon.damage = 9999     // Harus jadi 1000
    println("Damage sekarang: ${weapon.damage}")

    println("Tier senjata: ${weapon.tier}")
}