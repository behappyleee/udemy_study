package com.canbe.function

import java.time.LocalDate

fun main() {

    println(printPersonDetaiL(name = "sds", email = "asdsd"))
    printPersonDetaiL(name = "Test", dob = LocalDate.parse("2004-12-01"))

}

// 기본 default Value 설정이 가능
fun printPersonDetaiL(
    name: String,
    email: String = "",
    dob: LocalDate = LocalDate.now(),
) {
    println("Name: $name, email: $email, dob: $dob")
}

fun defaultValue() {

}


