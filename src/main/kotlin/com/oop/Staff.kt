package com.oop

class Staff(salary: Double, bonus: Double):Employee(salary, bonus) {
    override fun computeBonus(){


     println("Staff bonus is $bonus")
    }

}