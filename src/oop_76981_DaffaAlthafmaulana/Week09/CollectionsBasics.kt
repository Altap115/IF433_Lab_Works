package oop_76981_DaffaAlthafmaulana.Week09


fun main () {
    println("=== Test List ===")
    val framework: List<String> = listOf("Kotlin", "Java", "C")
    println("Immutable List: $framework")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n=== Test Set ===")
    val uniqeNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqeNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("ActiveUsers : $activeUsers")

    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A" // Value boleh duplikat, Key tidak
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20 // Menambah data baru
    inventory["Apples"] = 45  // Mengupdate data lama
    println("Inventory: $inventory")
}