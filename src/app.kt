/**
 * Created by Alex Diker on 5/24/2017.
 *
 * Just playing around with kotlin, this is just a playground // changed up and learned off a tutorial
 * Will continue to add information here as time goes on
 *
 */

fun main(args: Array<String>) {
    println("- - - \t - - - \t - - -")
    println("\tLearning Kotlin\n\t  Playground 1")
    println("- - - \t - - - \t - - -")

    val fooNum = 10 // declare a number

    fun varargExample(vararg names: Int){
        println("Argument has ${names.size} elements")
    }

        println("Marked with [vararg] Keyword to \nallow a variable number of arguments to be passed to a function\n")

    varargExample()
    varargExample(1)
    varargExample(1,2,3) //=> has 3 elements
    varargExample(1,2,3,4,5,500,200) //=> argument still has 7 elements

    /*
        Welcome function, hello kotlin
    */
    fun welcome(name: String = "") : String {
        return "\nHello, $name!\n"
    }

        println(welcome("Default User"))

        println("\tDeclared Number: " + fooNum)
    /*
  Example of DataClass, adding String, and 3 Ints
    */
    data class DataClassExample (val a: String, val x: Int, val y: Int, val z: Int)

    val fooData = DataClassExample("Default User", 1, 1984 , 10)
    val fooData2 = DataClassExample("Default User", 1, 1984 , 10)

    val dataCopy = fooData.copy(y = 100)

        println("\ndataCopy:" + dataCopy)

    var (a, b, c) = dataCopy

        println("$a $b $c")

    println(fooData) // => DataClassExample (a="Default User" x=1, y=1991, z=4)
    println(fooData2)

//mutable data class example
    data class MutableDataClassExample (var q: Int, var w: Int, var e: Int)
    val exampleMutableData = MutableDataClassExample(11, 1, 0)
    with (exampleMutableData) {
        q -= 2 // subtract two
        w += 2 // add two
        e --
    }
    println(exampleMutableData) // => exampleMutableData

    data class anotherMutDataClassExample (var z: Int, var x: Int)
    val exampleMutableData2 = anotherMutDataClassExample(1840, 1)
    with (exampleMutableData2) {
        z -= 1000
        x += 100
    }
    println(exampleMutableData2)

    /*
  Lets create a list using listOf function, this is immutable -- elements will not be added or removed
    */
    println("\n" + "Car Company List:")
    val carList = listOf("BMW", "Audi", "Mercedes", "Tesla")
    println("size of list: " + carList.size)
    println(carList.first())
    println(carList.last())
    // Lets follow the tutorial and access the the list by index.
    println(carList[1] + "\n" + carList[2])

    /*
    Lets create a mutable list using mutableListOf
    */
    println("\n" + "Motorcycle Company List:")
    val motorcycleMutableList = mutableListOf("Kawasaki", "Suzuki", "Honda")
    motorcycleMutableList.add("Harley-Davidson")
    motorcycleMutableList.add("Ducati")
    motorcycleMutableList.add("Yamaha")
    println("size of list: " + motorcycleMutableList.size)
    println(motorcycleMutableList[0] + "\n" +motorcycleMutableList[1] + "\n" + motorcycleMutableList[2] + "\n" + motorcycleMutableList[3])
    println(motorcycleMutableList[4] + "\n" + motorcycleMutableList[5])
    println("\n")
    
    val exampleSet = setOf("Names", "Age", "Email")
    println(exampleSet.contains("Names")) // show true
    println(exampleSet.contains("Geographical_Location")) // show false

}