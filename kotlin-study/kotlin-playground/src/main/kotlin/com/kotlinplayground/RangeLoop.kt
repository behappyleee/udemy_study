package com.canbe.com.kotlinplayground

fun main() {

    // 1 to 3
    val range = 1 .. 3

    for (i in range) {
        println("i : $i")
    }

    // 3 to 1 reverse
    val reverseRange = 3 downTo 1
    for (i in reverseRange) {
        println("i : $i")
    }

    exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    var i = 1
    do {
        println("Do While Value of i is : $i")
        i++
    } while (i < 5)
}

fun exploreWhile() {
    var x = 1
    while ( x <  5) {
        println("Value of x is $x")
        x++
    }
}