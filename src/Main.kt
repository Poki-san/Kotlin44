//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Задание 1
    val z1 = listOf(
        (1..9).random(),
        (1..9).random(),
        (1..9).random(),
        (1..9).random(),
        (1..9).random(),
        (1..9).random(),
        (1..9).random(),
        (1..9).random(),
        (1..9).random(),
        (1..9).random()
    )
    var sum = 0
    for (i in 2..8)
        sum+=z1[i]
    println(sum)
    println()

    // Задание 2
    val z2 = listOf(1, 2, 3, 4)
    val str = z2.fold("") { a, b -> "$a$b" }
    println(str)
    println()

    // Задание 3
    val players = listOf(
        Player("Иван", 10000, 2000),
        Player("Олег", 50040, 4100),
        Player("Иван", 32000, 3040),
        Player("Иван", 25000, 2800),
        Player("Иван", 40000, 3700)
    )
    val exps =players.sumOf { it.exp }
    println("Сумма очков опыта: $exps")
    val moneys =players.sumOf { it.money }
    println("Сумма денег: $moneys")

    println()
    // Задание 4
    val fruits = listOf("Яблоко", "Абрикос", "Банан", "Виноград", "Вишня", "Кокос", "яблоко")
    val groupFruits = fruits
        .filter{it.length%2==0}
        .groupBy{ it.first().lowercase() }
    println(groupFruits)
}

data class Player(val name:String, val exp:Int, val money:Int)