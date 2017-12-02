package Funktionen

fun times(n: Int, f: (Int) -> Unit) {
    for (i in 1..n) {
        f(i)
    }
}

fun main(args: Array<String>) {
    times(5,{x -> println(x)})
}