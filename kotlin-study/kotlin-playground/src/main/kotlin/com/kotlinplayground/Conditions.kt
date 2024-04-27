package com.canbe.com.kotlinplayground

fun main() {

    val check = "Check Test"
    val test1 = {
        check
    }

    // 함수 값을 return 함
    println("Test1 Value : $test1")

    // if-else
    // when

    var name = "Alex"
    name = "Chloe"
    val result = if (name.length == 4) {
        println("Name is Four Characters")
        // Kotlin 은 block 의 마지막 값을 항상 Return
        name.length
    } else {
        println("Name is not four Characters")
        name.length
    }

    println(result)

    val position = 2
    val medal = if (position == 1) {
        "Gold"
    } else if (position == 2) {
        "Silver"
    } else if (position == 3) {
        "Bronze"
    } else {
        "No Medals"
    }

    println(medal)

    // when 문법을 이용
    val medal_1 = when(position) {
        1 -> {"Gold"}
        2 -> {"Silver"} // when 문에서 중괄호 사용 및 선택 가능
        3 -> "Bronze"
        else -> "No medals"
    }

    when(name.length) {
        4 -> println("Name is Four Characters")
        else -> println("Name is not four Characters")
    }

}