package com.example.myapplication

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
   var res =  GlobalScope.launch {
        repeat(1000){
            delay(10000)
            println("打印${it}")
        }
    }
    println("a")
    Thread.sleep(100)
    res.cancelAndJoin()
}