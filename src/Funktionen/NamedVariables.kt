package Funktionen

fun printString(str: String,
                prefix: String = "",
                postfix: String = "") {
    println(prefix + str + postfix);
}

fun main(args: Array<String>) {

    printString("Hallo") // Ausgabe Hallo
    printString("Hallo", "<") // Ausgabe <Hallo
    printString("Hallo", "<", ">") // Ausgabe <Hallo>

    printString("Hallo", prefix = "<", postfix = ">") //Ausgabe <Hallo>
    printString("Hallo", postfix = ">", prefix = "<") // Ausgabe <Hallo>

}