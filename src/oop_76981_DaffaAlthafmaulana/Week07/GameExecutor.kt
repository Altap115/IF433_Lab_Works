package oop_76981_DaffaAlthafmaulana.Week07

fun processEvent(event: BattleState) {
    when (event) {

        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}! Bersiap bertarung!")
        }

        is BattleState.LootDropped -> {
            println("Loot didapat: ${event.item.name} [${event.item.rarity}]")
        }

        is BattleState.GameOver -> {
            println("Game Over! Penyebab: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Anda berada di Safe Zone. Aman dari bahaya.")
        }
    }
}