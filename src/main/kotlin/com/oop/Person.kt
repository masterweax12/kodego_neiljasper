package com.oop
//Abstraction
open class Person {
    var name: String = "John"
        get(){return field}
        set(value){
            field = value
        }

    var age: Int = 23
        get(){return field}
        set(value) {
            if(value < 1){
                println("Invalid Age!")
            }else{
                field = value
            }
            field = value
        }

    init{
        println("Object Created!")
        println("name is $name, age is $age")
    }

    fun uPAge():Int{
        age++
        return age
    }

    fun change(age:Int){
        println(age)
    }
    open fun displayName(){
        println("Name is $name")
    }

}