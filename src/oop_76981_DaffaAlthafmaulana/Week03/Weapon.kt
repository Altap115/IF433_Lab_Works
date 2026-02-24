package oop_76981_DaffaAlthafmaulana.Week03

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println("WARNING: Damage tidak boleh negatif! Nilai tidak diubah.")
                    return
                }
                value > 1000 -> {
                    println("Damage terlalu besar! Diset ke maksimum 1000.")
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}