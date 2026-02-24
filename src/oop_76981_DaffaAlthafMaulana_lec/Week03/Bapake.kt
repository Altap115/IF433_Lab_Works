package oop_76981_DaffaAlthafMaulana_lec.Week03

class Bapake {
    private var nama:String = "Belum tau"
    private var umur:Int= 35
    protected var gaji: Int = 1000

    public fun set_nama(namabaru:String) {
        if(this.nama.length <= 0){
            println("EH nama ga boleh kosong")
        } else {
        this.nama = namabaru
        }
    }
    public fun get_nama():String{
        return this.nama
    }
    public fun set_umur(umurbaru: Int){
        if(umurbaru < 0){
            println("EH umur gaboleh kurang dari 0")
        }else{
            this.umur = umurbaru
        }
    }
    public fun get_umur(): Int{
        return this.umur
    }
}

class Anake: Bapake (){
    fun dapatin_gaji_bapak (): Int{
        this.gaji = 5500
        return this.gaji + 100
    }
}

fun main () {
    var ank = Anake()
    ank.set_nama("udin")
    bpk.set_umur(35)
    println("Nama papi kamu: ${ank.get_nama()}")
    println("Gaji bapak adalah: " + ank.dapatin_gaji_bapak())

}