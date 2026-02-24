package oop_76981_DaffaAlthafmaulana.Week04

open class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi $brand terbuka.")
    }
}