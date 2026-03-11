package oop_76981_DaffaAlthafmaulana.Week06

fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main () {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreaditCard()

    println ("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)
}