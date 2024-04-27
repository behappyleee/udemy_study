package com.canbe.com.kotlinplayground

fun main() {

    for (i in 1..10) {
        println("i in $i")
        if (i == 3) break
    }

    label()

}

fun label() {

    loop@ for (i in 1..10) {
        println("i in $i")
        if (i == 3) break@loop

        innerloop@ for (j in 1..5) {
            println("j in label $j")
            if (j == 2) break@innerloop
        }
    }
}
