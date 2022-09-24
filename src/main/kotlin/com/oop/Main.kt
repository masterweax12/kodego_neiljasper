package com.oop

fun main(){


    var joeStudent = Student(123456)
    println(joeStudent.name )
    joeStudent.age = -1
    joeStudent.displayStudentId()
    joeStudent.displayName()
}