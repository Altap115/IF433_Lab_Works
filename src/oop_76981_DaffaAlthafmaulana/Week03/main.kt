package oop_76981_DaffaAlthafmaulana.Week03

fun main() {
    val e = Employee("Budi")


    e.salary = -1000
    e.salary = 5_000_000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}