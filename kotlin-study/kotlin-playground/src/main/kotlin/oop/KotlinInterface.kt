package com.canbe.oop

// Interfaces in oops defines the contract which has some abstract methods
// The classes that implements the interface needs to implement it
// similar to Java, Interfaces can have abstract and non-abstract methods in it
// It cannot contain any state

class KotlinInterface {
}

fun main() {
    val sql1 = SqlCourseRepository()
    val course = sql1.getById(3)

    val noSql1 = NoSqlCourseRepository()
    val noCourse = noSql1.getById(3)

    val sqlSave = SqlCourseRepository()
    val save1 = sqlSave.save(
        Course(
            id = 7,
            name = "Name Test !!",
        )
    )

}

data class Course(
    val id: Int,
    val name: String,
)

interface CourseRepository {
    fun getById(id: Int): Course

    // default Interface 에서 구현 된 메서드라도 Override 가 가능 ... !!
    fun save(course: Course): Int {
        println("Save Course !!")
        return 1
    }
}

class SqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(
            id = 3,
            name = "Sql Course Repository !",
        )
    }

    override fun save(course: Course): Int {

        return 3
    }
}

class NoSqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(
            id = 3,
            name = "Sql Course Repository !",
        )
    }
}