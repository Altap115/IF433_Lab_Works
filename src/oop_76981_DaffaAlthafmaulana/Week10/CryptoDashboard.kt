package oop_76981_DaffaAlthafmaulana.Week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

    println("\n=== Transaction List ===")

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 500.0))
    txRepo.add(Transaction("TX002", 1200.0))

    txRepo.getAll().forEach {
        println("TxID: ${it.id}, Amount: ${it.amount}")
    }

    println("\n=== Search BTC ===")

    val result = coinRepo.searchByName("BTC")

    result.forEach {
        if (it is Coin) {
            println("Found: ${it.name} - ${it.balance}")
        }
    }
}