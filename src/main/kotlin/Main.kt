import kotlin.math.pow
import kotlin.random.Random

fun main(args: Array<String>) {
    //Task1
    val myAge = 20
    val isTeenager = 13 < myAge && myAge < 20
    //
    //Task2
    val theirAge = 30
    val bothTeenager = (13 < myAge && myAge < 20) && (13 < theirAge && theirAge < 20)
    //
    //Task3
    val reader = "Никита"
    val author = "Richard Lucas"
    val authorIsReader = reader == author
    //
    //Task4
    val readerBeforeAuthor = reader > author
    //
    //Task5
    val myAge2 = 20
    if (13 < myAge2 && myAge2 < 20) println("Подросток")
    else println("Не подросток")
    //
    //Task6
    val answer = if (13 < myAge2 && myAge2 < 20) println("Подросток") else println("Не подросток")
    //
    //Task7
    var counter = 0
    while(counter < 10){
        println(counter)
        counter++
    }
    //
    //Task8
    counter = 0
    var roll = 0
    do{
        roll = Random.nextInt(6)
        counter++
        println("После $counter бросков, roll равен $roll")
    }while(roll != 0)
    //
    //Task9
    val range = 1..10
    for (i in range){
        println("${i.toDouble().pow(2.0)}")
    }
    //
    //Task10
    for (i in range){
        println(Math.sqrt(i.toDouble()))
    }
    //
    //Task11
    var sum = 0
    for (row in 1 until 8 step 2){
        for (column in 0 until 8){
            sum += row * column
        }
    }
    println(sum)
    //
}