package com.example.myapplication.core

fun main() {
    ktrun(true, "asdf") {
        Thread.sleep(50000)
        println("子线程耗时操作")
    }
}
//自定义轮询器
fun doCount(counts:Int,mm:(Int)->Unit){
    for (index in 0 until counts){
        mm(index)
    }
}
//自定义线程封装
fun ktrun(start: Boolean, name: String, Runnerable: () -> Unit): Thread {
    var theard = Thread() {
        run {
             Runnerable()
        }
    }
    name ?: "NullTheard"
    if (start)
        theard.state
    return theard
}