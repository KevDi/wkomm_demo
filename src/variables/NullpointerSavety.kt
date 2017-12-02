package variables

fun main(args: Array<String>) {

    var a = "abc"
    //a = null // Fehler a not nullable
    var b : String? = "abc"
    b = null // Funktioniert

    //b.length // Nicht möglich da b null sein kann
    var i = b?.length // Funktioniert!
    println(i)

    val l = if ( b != null) b.length else -1 // -1

    val l2 = b?.length ?: -1 // -1

    println(b!!.length) // Nullpointer Exception

}