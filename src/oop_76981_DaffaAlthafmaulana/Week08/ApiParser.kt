package oop_76981_DaffaAlthafmaulana.Week08

class ApiParser {
    val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
    val warranty = rawJson["warranty"] as? Int ?: 12
    val size = rawJson["size"] as? String ?: "All Size"
}