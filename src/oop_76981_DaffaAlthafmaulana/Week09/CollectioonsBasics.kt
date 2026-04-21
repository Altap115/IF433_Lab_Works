package oop_76981_DaffaAlthafmaulana.Week09


fun main () {
    println("=== Test List ===")
    val framework: List<String> = listOf("Kotlin", "Java", "C")
    println("Immutable List: $framework")

    val scores: MutableList<Int> = mutableListOf(85,90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n=== Test Set ===")
    val uniqeNumbers = setOf(1,2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqeNumbers" )

    val activeUsers = mutableSetOf("UserA","UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("ActiveUsers : $activeUsers")
}