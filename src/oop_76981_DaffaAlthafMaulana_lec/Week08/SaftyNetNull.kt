package oop_76981_DaffaAlthafMaulana_lec.Week08

fun main() {
    var nama: String? = "Susi"

    try{
        println("nama kamu adalah ${nama!!.uppercase()}")
    } catch(ex: Exception){
        println("Errornya adalah ${ex.message}")
    }

    var dataMhs: List<Any> = listOf(123,"Wirawan",89,"Tangerang")
    for (item in dataMhs) {
        var itemFilter = item as? String
        if(itemFilter != null) {
            println(itemFilter)
        }
    }
}