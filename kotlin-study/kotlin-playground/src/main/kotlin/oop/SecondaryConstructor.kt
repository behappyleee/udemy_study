package com.canbe.oop

class SecondaryConstructor() {

    var name: String = ""   // val 이면 value 값을 바꿀 수 없음

    constructor(_name: String): this() {
        name = _name
    }
}

class PersonSecondaryConstructor(
    val name: String= "",
    val age: Int = 0,
) {

    var email : String = ""

    // 부 생성자와 주 생성자를 함께 가질 수 있음
    // 부 생성자는 멀리 하는 게 좋음
    constructor(
        _email: String,
    ): this () {
        email = _email
    }

    fun personAction() {
        println("Person Action !!")
    }
}

fun main() {
    val sc1 = SecondaryConstructor()
    println("SC1 Name is ${sc1.name}")

    val sc2 = SecondaryConstructor(_name = "SecondName")
    println("SC2 Name is ${sc2.name}")

    // sc1 값 변경
    sc1.name = "TEST NAME CHANGE"
    println("SC1 Changed Name : ${sc1.name}")

    val personSecondaryConstructor =  PersonSecondaryConstructor(_email = "Email Test") // Secondary Constructor 로 생성이 됨
    val person1 = PersonSecondaryConstructor() // Primary 생성자로 생성이 됨


    println("person1 email : ${person1.email}")
    println("person1 Name is ${personSecondaryConstructor.name}, email : ${personSecondaryConstructor.email}")

}