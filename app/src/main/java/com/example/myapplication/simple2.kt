package com.example.myapplication

private fun loginService(UserName:String,UserPwd:String,requestLogin:(String,String)->Unit):Unit{

}
fun LoginEngine(userName:String,userpwd:String):Unit{
    loginService(userName,userpwd){
        s1,s2->
        println("s1:$s1,s2:$s2")
        if (s1.equals("s1")&&s2.equals("s2")){
            println("successful")
        }else{
            println("no")
        }
    }
}