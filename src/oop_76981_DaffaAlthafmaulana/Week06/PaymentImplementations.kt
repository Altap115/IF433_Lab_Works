package oop_76981_DaffaAlthafmaulana.Week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) { println("Proccesing Rp$amount via Gopay server") }
}

class CreaditCard : PaymentMethod {
    override fun pay(amount: Double) { println("Contacting Bank for Rp$amount") }
}