package oop_76981_DaffaAlthafmaulana.Week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}