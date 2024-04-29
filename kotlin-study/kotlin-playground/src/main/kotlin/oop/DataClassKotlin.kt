package com.canbe.oop

// Data Class 는 데이터를 가지고 데이터를 카테고리화도 가능
// 자바에서는 JavaBean 에서 이러한 타입에 클래스 들이 존재
// Data Class 에 이점
// Data Class 는 주로 데이터 컨테이너 같은 역할을 할 때 사용
// data 클래스를 사용 시 많은 유용한 함수들이 자동 생성이 됨
// copy() 함수는 새 객체를 만들 시 매우 유용 함

data class DataClassKotlin(
    val id: Int,
    val name: String,
    val author: String,
)

class DataClassKotlinTest(
    val id: Int,
    val name: String,
    val author: String,
)

fun main() {

    // Data Class 에 3개의 Parameter 가 존재
    val dc1 = DataClassKotlin(
        id = 1,
        name = "Name Dto",
        author = "Author Dto",
    )
    // Data Class 를 사용 시 이점임
    // Data Class 는 print 시 객체 내부 값이 모두 보임
    println(dc1)

    val dc1_same = DataClassKotlin(
        id = 1,
        name = "Name Dto",
        author = "Author Dto",
    )

    // Data Class 는 내부 값이 같으면 True 같은 값으로 봄
    println("Data Class Compare : ${dc1 == dc1_same}")

    // copy 는 객체를 Copy 시 매우 유용
    val dc2_copy = dc1.copy(
        id = 3,
        name = "Name Dto",
        author = "Author Dto",
    )

    println("dc2_copy value ${dc2_copy}")

    val dc2 = DataClassKotlinTest(
        id = 2,
        name = "Name Dto",
        author = "Author Dto",
    )

    val dc2_same = DataClassKotlinTest(
        id = 2,
        name = "Name Dto",
        author = "Author Dto",
    )

    println(dc2)    // DataClass 는 print 시 내부 값이 모두 보이지만 Class 는 주소값만 보임
    println("Class Compare : ${dc2 == dc2_same}")   // Class 는 내부 값이 같아도 False


}