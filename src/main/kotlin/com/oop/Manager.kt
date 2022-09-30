package com.oop

class Manager(salary: Double, bonus: Double):Employee(salary, bonus) {
    override fun computeBonus(){
    //additional 10%

     println("Manger's bonus is  ${bonus+(bonus*0.1)}")

    }


}