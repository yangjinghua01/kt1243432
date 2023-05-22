package com.example.myapplication.core
// 这个类，就是只能修改，不能获取
// 声明的时候加入 一劳永逸 in
class student<in T> {
//    fun a(list: MutableList<T>) {
//
//    }
    fun setData(data:T){

    }
//    fun getData(data: T):T{
//
//    }
}