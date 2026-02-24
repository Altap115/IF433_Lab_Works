package oop_76981_DaffaAlthafmaulana.Week04

open class Vehicle(val brand: String) {

    open fun honk() {
        println("$brand berbunyi: Tiiin Tiiin!")
    }

    open fun accelerate() {
        println("$brand sedang berakselerasi.")
    }
}