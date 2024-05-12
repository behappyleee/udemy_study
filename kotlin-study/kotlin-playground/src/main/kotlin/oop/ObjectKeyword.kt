package com.canbe.oop

// Kotlin Object Keyword
// This keyword allows us to create a class and an instance of the class at the same time
// Equivalent to a singleton pattern in Java

fun main() {
    Authenticate.authenticate("UserName", "UserPasswd")

}

object Authenticate {

    fun authenticate(userName: String, password: String) {
        println("User Authenticate for UserName : $userName")
    }
}


class ObjectKeyword {
}