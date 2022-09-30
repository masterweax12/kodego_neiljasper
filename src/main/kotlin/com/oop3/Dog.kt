package com.oop3

class Dog:Mammal(),Animal,Pet {
    override fun walk(){
        println("A dog walks")

    }
    override fun makeSound(){
        println("Aw Aw")

    }

    override fun groom(){
        println("Dog can be groomed")

    }

    override fun feed(){
        println("Dog feeds")

    }

}