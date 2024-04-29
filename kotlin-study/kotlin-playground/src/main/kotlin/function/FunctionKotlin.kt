package com.canbe.function

fun main() {
    val unitValue = printName("Hello Function")
    println(unitValue)

    val result = addition(1, 2)
    println("Result : $result")
}

fun addition(i: Int, j: Int): Int {
    return i + j
}

fun additionExpression(x: Int, y: Int) = x + y

fun printName(s: String): Unit {
    println("Name is $s")
}