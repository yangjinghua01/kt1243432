package com.example.myapplication

fun main() {
//    () -> Unit 空参函数 并且没有返回值 函数名method01
    var methed01: () -> Unit
//    methed01()//不能调用 没有具体的实现
    var methed02: (Int, Int) -> Int
//    methed02(1, 2)
    var methed03: (String, Double) -> Any
//    methed03("fdas", 5555.22)
    var methed04: (Int, Double, Long, String) -> Boolean
//    methed04()
    // TODO: 2023/5/21  上面的定义没有问题，调用不行
    // TODO: 2023/5/21  下面的定义没有问题，调用ok，因为有实现了
    var m06: (Int, Int) -> Int = { number1, number2 -> number1 + number2 }
    m06(1, 3)
//    使用： （形参类型）
//    使用 = {具体实现}
    var m07 = { number: Int, number2: Int -> number + number2 }
    var m08: (String, String) -> Unit = { str1, str2 -> print("a:${str1}+b:${str2}") }
    var m09: (String) -> String = { str -> str }
    var m10: (Int) -> Unit = {
        when (it) {
            1 -> print(1)
            in 5..10 -> print("5到10")
            else -> print("other")
        }
    }
    var m11: (Int, Int, Int) -> Unit = { a, b, c ->
        println("a:$a,b:$b,c:$c")
    }
    var m12 = { print("adsfdsa") }
    var m13 = { sex: Char -> if (sex.equals("m")) "nan" else "nv" }
//   覆盖操作
    var m14 = { number1: Int -> print("$number1") }
    m14 = { print("cover:$it") }
    m14(99)
    var m15={ numbner: Int ->
        print("$numbner")
        numbner
    }
}