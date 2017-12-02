package klassen

open class Person3(val name : String, var age: Int)


fun main(args: Array<String>) {

    var pers1 = Person3("Max", 20)
    pers1.age = 30
    //pers1.name = "Martin" // Fehler Name ist Value
    println(pers1.age)
    println(pers1.name)

}