package oop_76981_DaffaAlthafmaulana.Week06

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }
}