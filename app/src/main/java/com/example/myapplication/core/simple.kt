package com.example.myapplication.core

val names:String ="yjh"

val ages:Int =18
fun commonOk(){
    println("funton")
}
fun main() {
    commonOk().verb {
        ""
    }
}
fun <万能类型>万能类型.verb(mm:()->String):String=
    mm()
