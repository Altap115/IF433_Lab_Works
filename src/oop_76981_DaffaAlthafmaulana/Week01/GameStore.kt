package oop_76981_DaffaAlthafmaulana.Week01

fun main() {
    val gameTitle = "Cyberpunk 2077"
    val price = 650000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount
    val userNote: String? = null

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )

    fun printReceipt(title: String, finalPrice: Int, note: String?) {
        println("Judul Game   : $title")
        println("Harga Akhir  : Rp $finalPrice")
        println("Catatan     : ${note ?: "Tidak ada catatan"}")
    }
}
fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        price * 20 / 100
    } else {
        price * 10 / 100
    }

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("Judul Game   : $title")
    println("Harga Akhir  : Rp $finalPrice")
    println("Catatan     : ${note ?: "Tidak ada catatan"}")
}