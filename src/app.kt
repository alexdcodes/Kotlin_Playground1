/**
 * Created by Alex Diker on 5/24/2017.
 *
 * Just playing around with kotlin, this is just a playground
 *
 */

fun main(args: Array<String>) {
    println("- - - \t - - - \t - - -")
    println("\tLearning Kotlin\n\t  Playground 1")
    println("- - - \t - - - \t - - -")

    val fooNum = 10 // declare a number


    fun welcome(name: String = "") : String {
        return "\nHello, $name!"
    }

    println(welcome("Default User"))

    println("\tDeclared Number: " + fooNum)

    data class DataClassExample (val a: String, val x: Int, val y: Int, val z: Int)
    val fooData = DataClassExample("Default User", 1, 1991 , 4)
    println(fooData) // => DataClassExample (x=1, y=2, z=4)
}