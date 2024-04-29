package com.canbe.oop

// Class in object oriented programming is fundamentally the blueprint for creating objects
// Java 와 똑같음, 함수는 동작의 일부임

fun main() {
    // 인스턴스 생성
    val person1 = PersonInfo()
    person1.personAct() // Class 의 함수 호출이 가능

    val person2 = PrimaryConstructPerson(name = "Alex", age = 23)
    // Default Value 가 설정 되어 있으면 Constructor 값을 입력하지 않아도 됨 !
    val person3 = PrimaryConstructPerson()

}

class PersonInfo {
    fun personAct(): String {
        println("do something !")
        return "Person Do Something !"
    }
}

// Constructor is a concept in object oriented programming through which we
// we can create an Object with initial values

class PrimaryConstructPerson(
    val name: String = "Default Name Value",
    val age: Int = 21,
) {

}

class KotlinClass {


}