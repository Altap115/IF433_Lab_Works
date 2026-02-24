package oop_76981_DaffaAlthafmaulana.Week02.Student
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("=== LIBRARY SYSTEM ===")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine()

// Validasi tidak boleh minus
    if (duration < 1) {
        println("Durasi tidak valid! Diubah menjadi 1 hari.")
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")
}