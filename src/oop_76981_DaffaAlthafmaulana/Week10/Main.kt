package oop_76981_DaffaAlthafmaulana.Week10

fun main() {
    // === TEST GENERIC CLASS === (Latihan B)
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}