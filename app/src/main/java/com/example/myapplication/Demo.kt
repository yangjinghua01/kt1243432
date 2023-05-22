package com.example.myapplication

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// TODO: 2023/5/22 例子1
//fun main() {
////    非阻塞，类似于守护线程
//    GlobalScope.launch {
//        delay(1000)
//        println("11111")
//    }
//    println("A")
//    Thread.sleep(2000)
//    print("B")
//}
fun main() {
    GlobalScope.launch {
        delay(1000)
        println("11111")
    }
    println("A")
    Thread.sleep(200)
    print("B")
}


