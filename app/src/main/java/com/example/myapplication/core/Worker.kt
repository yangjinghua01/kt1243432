package com.example.myapplication.core

class Worker<out T> {
    /**
     * 能获取
     */
    fun getData(): T? = null
    /**
     * 不能修改
     */
//    fun setData(data: T){
//
//    }
}