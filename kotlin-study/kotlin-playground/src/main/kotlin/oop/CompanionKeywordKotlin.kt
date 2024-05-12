package com.canbe.oop

// Companion Object
// Kotlin does not have the support for the static keyword
// companion object can be used to introduce static functionalities that are tied to the class.
// Using Object inside the class requires you to use the companion keyword

fun main() {
    val country = Student2.country()
    println(country)
    println(Student2.testCompanionValue)
}

open class User2(name: String) {}

class Student2(val nameStudnet: String): User2(name = nameStudnet) {

    companion object {
        val testCompanionValue = 10
        fun country() = "USA"
    }
}

class CompanionKeywordKotlin {
}