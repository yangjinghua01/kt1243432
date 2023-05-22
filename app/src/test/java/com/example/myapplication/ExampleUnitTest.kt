package com.example.myapplication

import kotlinx.coroutines.*
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun run(){
       myWith("111",) { i ->
            println(i)
            "dsaf"
        }
    }
//    高阶函数的参数是从mm(1)这里传入的。
    fun <T,R> myWith(a:T,mm:T.(Int)->R):R{
        return a.mm(1)
    }
    @Test
    fun test(){
        testxccancle()
    }
    fun testxc(){
        runBlocking {
            launch (Dispatchers.IO){
                delay(10000)
                println("11111")
            }
        }
        println("a")
        Thread.sleep(200)
        println("B")
    }
    fun testxc1(){
        runBlocking {
            GlobalScope.launch {
                delay(10000)
                println("11111")
            }
        }
        println("a")
        Thread.sleep(200)
        println("B")
    }
    fun testxccancle(){
        var res =  GlobalScope.launch {
            repeat(1000){
                delay(10)
                println("打印${it}")
            }
        }
        println("a")
        Thread.sleep(100)
        res.cancel()
        res.cancelAndJoin()
    }
}