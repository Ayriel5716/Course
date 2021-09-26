package com.course;

public class HelloJava {            /*extends java.lang.Object*/
    public static void main(String[] args) {

//        Person p = new Person();  /*從類別生成物件後＊/
//        p.hello();                /*再從物件當中去呼叫其方法hello()*/

        new Person().hello();       /*(寫法較佳)*/
    }
}


