package numbers

import java.math.BigDecimal
import java.util.ArrayList

fun main(args : Array<String>) {
    val a = "2.0".bd
    val b = "1.1".bd

    println(a - b)
}















val String.bd : BigDecimal
  get() = BigDecimal(this)









fun BigDecimal.minus(other : BigDecimal) = this.subtract(other)