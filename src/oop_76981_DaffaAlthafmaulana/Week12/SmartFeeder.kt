package oop_76981_DaffaAlthafmaulana.Week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== SMART PET FEEDER SYSTEM ===")
    println("\n--- Jadwal Makan Pagi ---")
    try {
        // Minta 80 gr, tapi stok hanya 50 gr -> FoodEmptyException
        val remaining = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
        currentKibbleStock = remaining
    } catch (e: DispenserJamException) {
        println("ERROR HARDWARE: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("ERROR STOK: ${e.message}")
    } catch (e: Exception) {
        println("ERROR UMUM: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
}
