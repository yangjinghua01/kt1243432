package com.example.myapplication.core

class TestOutIn {
// out 只能取，不能修改 == ？extends ParentClass
    val  list:MutableList<out ParentClass> = ArrayList<SonClass>()
// in 只能修改（存），不能获取 === ？super SonClass
    val list1:MutableList<in SonClass> = ArrayList<ParentClass>()

}