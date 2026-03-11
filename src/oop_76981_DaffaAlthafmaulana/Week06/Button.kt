package oop_76981_DaffaAlthafmaulana.Week06

class Button(override val name: String) : Clikable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}