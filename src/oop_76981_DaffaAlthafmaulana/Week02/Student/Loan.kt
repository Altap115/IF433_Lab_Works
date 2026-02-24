package oop_76981_DaffaAlthafmaulana.Week02.Student

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1   // Default = 1 hari
) {

    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}