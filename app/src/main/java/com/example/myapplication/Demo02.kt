package com.example.myapplication

import kotlinx.coroutines.*

suspend fun main() {
    runBlocking {
        GlobalScope.launch {
            delay(1000)
            println("11111")
        }
    }
    println("a")
    delay(2000)
    println("B")
}

//suspend fun testxc(){
//    runBlocking {
//        launch (Dispatchers.IO){
//            delay(1000)
//            println("11111")
//        }
//    }
//    println("a")
//    delay(200)
//    println("B")
//}