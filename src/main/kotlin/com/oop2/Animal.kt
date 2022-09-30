package com.oop2

abstract class Animal {
    //1)it can have abstract functions
    //2)abstract functions are functions without a body/implementation
    //3)only abstract classes can have abstract function
    //4)you cannot create an object from an abstract class
    //5)abstract class is always superclass only
    //6)when you inherit from an abstract class, you are
    // REQUIRED to override all it's abstract functions
    abstract fun walk()
    abstract fun makeSound()
}