package com.canbe.oop

fun main() {

    val c1 = CustomGetterSetter()
    println("PRICE : " + c1.price)
    println("NAME : " + c1.name)
    c1.name = "Name Set"
    println("After Name : ${c1.name}")

    val c2 = CustomGetterSetter("NameConstructor")
    println("NameCons : ${c2.name}")
}

class CustomGetterSetter() {
    var name: String = ""
    set(value) {
        field = value + "Custom"
    }

    var price: Double = 0.0
    get() {
        val test = field + 3
        return test
    }
    set(value) {
        if (value > 0.0) {
            field = value
        } else {
            throw IllegalArgumentException("Not negative value")
        }
    }

    constructor(_name: String): this() {
        name = _name
    }
}

