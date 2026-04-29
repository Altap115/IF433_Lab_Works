package oop_76981_DaffaAlthafmaulana.Week10

class WalletRepository<T> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(name: String): List<T> {
        return items.filter {
            when (it) {
                is Coin -> it.name.equals(name, ignoreCase = true)
                else -> false
            }
        }
    }
}