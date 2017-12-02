package klassen

data class Person4(val name: String, var age: Int)


fun main(args: Array<String>) {

    var pers1 = Person4("Max", 20)

    println(pers1.hashCode())
    println(pers1.toString())
    

}