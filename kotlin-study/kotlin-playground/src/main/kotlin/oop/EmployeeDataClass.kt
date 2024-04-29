package com.canbe.oop

data class EmployeeDataClass(
    val id: Int,
    val name: String,
)

fun main() {

    val emp1 = EmployeeDataClass(
        id = 1,
        name = "emp"
    )

    val emp2 = EmployeeDataClass(
        id = 1,
        name = "emp"
    )

    println("Emp Data Class Compare : ${emp1 == emp2}")

    val emp_copy = emp1.copy()
    println("Emp Copy Data Compare : ${emp1 == emp_copy}")

}