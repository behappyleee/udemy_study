package com.canbe.oop

// Inheritance is supported in Kotlin
// Kotlin Concepts
// 1. Any is the superclass for any class in Kotlin
// 2. Object class in Java
// All the classes in Koltin are final
// Extending classes are not allowed by default

fun main() {
    val st1 = Student(nameStudent = "NameStudentTest")
    val in1 = Instructor(nameInstructor = "NameInstructorTest")

    println("StudentName : ${st1.name}")


}


class ExtendKotlinClass {
}

// kotlin 은 dfeault 가 final 클래스이므로 open 으로 명시를 해주어야 함
open class User(
     val name: String
) {}

class Student(nameStudent: String): User(name = nameStudent) {}

class Instructor(nameInstructor: String): User(name = nameInstructor) {}


// kotlin 은 default 가 final 클래스 이므로 open 을 명시해주어야 함 !
open class KotlinExtend() {

}