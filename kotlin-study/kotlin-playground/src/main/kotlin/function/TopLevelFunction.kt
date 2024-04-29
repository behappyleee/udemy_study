package com.canbe.function

// Functions that does not belong to a class are top-level
// functions
// In Java functions can only be part of class

// Java 에서는 함수가 클래스의 일부임 (오직 Class 에만 속할 수 가 있음)

// In Java 에서는 공통 로직을 static method 를 만들어 앱 전반적으로 사용이 가능
// Kotlin 은 top level Function 을 사용하여 이러한 문제를 피할 수 있음

// In kotlin properties that does not belong to class are called top-level properties

// In Java 오직 Class 나 Interface 안에서만 정의가 가능

fun topLevelFunction(): Int {

    return (0 .. 100).random()
}

// 앱 전반에 걸쳐 사용이 가능
const val courseName = "Kotlin Programming Course"

fun main() {
    val num = topLevelFunction()

    println(num)
}