package ` oop_76981_DaffaAlthafmaulana`.week01

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 650000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )
}
fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        price * 20 / 100
    } else {
        price * 10 / 100
    }

fun printReceipt(title: String, finalPrice: Int) {
    println("Judul Game   : $title")
    println("Harga Akhir  : Rp $finalPrice")
}