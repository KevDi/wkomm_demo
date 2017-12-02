package Funktionen

import java.math.BigDecimal

fun addBigDecimal(x: BigDecimal, y: BigDecimal) {
    println(x.add(y))
}

infix fun Int.percentOf(x : Int) = (x * this) / 100


fun main(args: Array<String>) {


    addBigDecimal(BigDecimal(10), BigDecimal(20))

    addBigDecimal(10.bd, 20.bd)

    println(7 percentOf 30)

}

private val Int.bd: BigDecimal
    get() = BigDecimal(this)



