package variables

fun main(args: Array<String>) {

    demo("abc") // Ausgabe: 3
    demo(123) // Ausgabe: Not String

}

fun demo(x: Any) {
    if (x is String) {
        println(x.length)
    } else {
        println("Not String")
    }
}