package oop_76981_DaffaAlthafmaulana.Week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, -10.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, 12.3, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 10, 8.0, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 5, -2.5, "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 20, 20.1, "CLOSED")
    )

    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }
}