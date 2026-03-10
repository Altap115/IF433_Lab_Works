package oop_76981_DaffaAlthafmaulana.Week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)

}