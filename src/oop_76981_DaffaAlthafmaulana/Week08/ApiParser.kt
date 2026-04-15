package oop_76981_DaffaAlthafmaulana.Week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }

        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name"
        }

        return when (rawJson["type"] as? String) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }

            else -> null
        }
    }

    fun checkout(product: Product) {
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        val trxId = JavaPaymentService.processPayment(id)!!
        println("Transaction Success: $trxId")
    }
}