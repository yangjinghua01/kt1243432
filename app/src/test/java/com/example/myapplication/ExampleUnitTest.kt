package com.example.myapplication

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

}