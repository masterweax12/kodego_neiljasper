package com.oop

class Student(var _studentId:Int) : Person("waweks", 25) {
    var studentId : Int = _studentId

    fun displayStudentId(){
        println(studentId)
    }
    override fun displayName(){
        super.displayName()
        println("displaying function displayName from Student Class.")
    }

}

//polymorphism