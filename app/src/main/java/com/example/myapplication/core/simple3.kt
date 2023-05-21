package com.example.myapplication.core

val name:String ="yjh"

val age:Int =18

fun main() {
    var a =  connont().myRun {
        println("dslaf")
        "yjhhhhh"
    }
    age.yjhRun(){
        i -> print(i+1)
        i
    }
    println("===========>")
    myWith("111",){
        i ->
        println(i)
        "dsaf"
    }
}
fun connont():String{
    println("funtion")
    return "hahhah"
}
//T.()表示给t来一个匿名函数
fun<T,R>T.myRun(m:T.()->R):R{
    return m()
}
//方法前泛型 用泛型点方法明就是为所有类型进行拓展
fun <T>T.yjhRun(v:T.(Int)->Int){

}
fun <T,R> myWith(a:T,mm:T.(Int)->R):R{
    return a.mm(1)
}