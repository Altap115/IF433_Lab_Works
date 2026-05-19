package oop_76981_DaffaAlthafmaulana.Week13

import java.io.File

fun main() {
    val file = File("notes.txt")

    file.writeText("Belajar Kotlin File I/O\n")

    println("File berhasil ditulis.")
}