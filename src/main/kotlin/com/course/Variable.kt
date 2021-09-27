package com.course

fun main() {
    val age1 = 20         //沒有指定資料型態

    val age2 : Int = 20   //有指定資料型態

    var weight = 60.5f     //自動推斷型態為float
    /* == var weight : Float = 60.5f*/

    var name : String      //沒有給定值的變數，就必須給定型態
    name = "Ayres"
}