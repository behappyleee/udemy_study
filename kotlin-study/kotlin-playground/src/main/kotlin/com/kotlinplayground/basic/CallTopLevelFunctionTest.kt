package com.canbe.com.kotlinplayground.basic

import com.canbe.function.courseName    // 변수명을 직접 import 해주어야 함
import com.canbe.function.topLevelFunction // Package Import 할 때 함수에 직접 접근하여 사용

// 다른 패키지에서도 TopLevel Function 호출이 가능
fun main() {
    val testNum = topLevelFunction()
    println(testNum)
    // 호출이 가능
    println(courseName)
}