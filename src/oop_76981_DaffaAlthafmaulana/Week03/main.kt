package oop_76981_DaffaAlthafmaulana.Week03

fun main() {
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    e.salary = -1000   // Harusnya print error
    e.salary = 5_000_000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    // e.performanceRating = 5  // Kalau di-uncomment pasti error

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")
}