package oop_76981_DaffaAlthafmaulana.Week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].toInt(),
            symbol = parts[1],
            type = parts[2],
            margin = parts[3].toDouble(),
            pnl = parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { writer.println(it.toCsv()) }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File trades tidak ditemukan!")
        emptyList()
    }
}

val trades = listOf(
    TradeRecord(id = 1, symbol = "BTCUSDT", type = "Long",  margin = 100.0, pnl =  25.50),
    TradeRecord(id = 2, symbol = "ETHUSDT", type = "Short", margin =  50.0, pnl = -10.00),
    TradeRecord(id = 3, symbol = "SOLUSDT", type = "Long",  margin =  75.0, pnl =  18.75)
)

saveTrades(trades, path = "crypto_trades.csv")
println("Trade records berhasil disimpan ke crypto_trades.csv")

File("crypto_trades.csv").appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")
println("Baris data korup berhasil di-inject untuk pengujian robustness.")

println("\n=== MEMUAT DATA HISTORI ===")
val loadedData = loadTrades(path = "crypto_trades.csv")

val totalPnl = loadedData.sumOf { it.pnl }