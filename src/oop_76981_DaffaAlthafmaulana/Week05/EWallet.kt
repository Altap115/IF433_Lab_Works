package oop_76981_DaffaAlthafmaulana.Week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran EWallet berhasil oleh $accountName. Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup pada EWallet milik $accountName")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil. Saldo sekarang: $balance")
    }
}