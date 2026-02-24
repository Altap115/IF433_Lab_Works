package oop_76981_DaffaAlthafmaulana.Week02.Student
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("\n=== MINI RPG BATTLE ===")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\n1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()
        scanner.nextLine()

        if (choice == 1) {

            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh menyerang balik sebesar $enemyDamage!")
                hero.takeDamage(enemyDamage)
                println("HP $heroName: ${hero.hp}")
            }

        } else if (choice == 2) {
            println("$heroName kabur dari pertempuran!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

// Hasil akhir
    println("\n=== HASIL PERTEMPURAN ===")
    if (hero.hp > 0 && enemyHp == 0) {
        println("$heroName MENANG!")
    } else if (hero.hp == 0) {
        println("Enemy MENANG!")
    } else {
        println("Pertempuran berakhir tanpa pemenang.")
    }
}