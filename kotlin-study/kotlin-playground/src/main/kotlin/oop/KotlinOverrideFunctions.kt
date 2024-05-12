package com.canbe.oop

class KotlinOverrideFunctions {

}

open class User1(val name: String) {

    open var isLoggined: Boolean = false

    open fun login() {
        isLoggined = true
        println("Inside User Login Function !")
    }
}

class Student1(
     val nameStudent: String
) : User1(name = nameStudent) {

    override var isLoggined: Boolean = true

    override fun login() {
        super.login()   // 부모 login 메서드에 접근이 가능 !!
        isLoggined = true
        println("Override Login Function !! $nameStudent")
    }
}


