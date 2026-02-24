package oop_76981_DaffaAlthafmaulana.Week04

fun Main3() {
    println("----- EMPLOYEE HIERARCHY TEST -----")

    val manager = Manager("Andi", 10_000_000)
    val developer = Developer("Budi", 8_000_000, "Kotlin")

    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    println("-----")

    developer.work()
    println("Bonus Developer: ${developer.calculateBonus()}")
}