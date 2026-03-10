package oop_76981_DaffaAlthafmaulana.Week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran Credit Card berhasil oleh $accountName. Total terpakai: $usedAmount")
        } else {
            println("Transaksi ditolak. Melebihi limit kartu kredit milik $accountName")
        }
    }
}