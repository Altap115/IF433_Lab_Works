package ` oop_76981_DaffaAlthafmaulana`.week01

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 650000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        price * 20 / 100
    } else {
        price * 10 / 100
    }