package com.canbe.oop

class InitializeAndBlock(
    val name: String = "",
    val age: Int = 0,
) {

    var email: String = ""
    var nameLength: Int = 0
    // init 코드 블록은 Instance 가 생성되는 동안에 실행이 됨
    init {
        println("Init Block !")
        // Initialize 될 때 초기화 됨 !
        nameLength = name.length
    }
}

fun main() {
    val initTest = InitializeAndBlock(name = "Name Length !")
    println("Name Length : ${initTest.nameLength}")
}