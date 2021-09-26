package com.course

fun main() {
    //Human()             /*將Human()生成到記憶體當中(就是生成物件)*/

    //val h = Human()     /*將物件放入變數中＊/
    //h.hello()

    Human().hello()       /*(寫法較佳)*/
}

class Human {
    fun hello(){
        println("Hello Kotlin")
    }
}