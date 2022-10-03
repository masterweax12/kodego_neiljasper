package excercise_activities

/*
Author Name: Neil Jasper A. Juntilla
Date Created: October 02, 2022
File Name: ExcerciseActivity02F.kt
 */

fun main(){
    println("Groceries Goods and Stocks Lists\n")
    println("Do you wish to check our available products? Yes/No")
    var yesOrNo = readln()
    if(yesOrNo == "Yes") {
        //categories for food
        println("Categories: ${cat[0]}")
        var foods = arrayOf<String>("Rice", "Fresh meat", "Bread", "Sugar", "Biscuit", "Snacks")
        for (food in foods) {
            println(food)
        }
        //categories for non food
        println("\nCategories: ${cat[1]}")
        var nonFoods = arrayOf<String>("Detergent", "Sanitary", "Plastic Containers", "Utensils", "Floor Wax")
        for (nonFood in nonFoods)
            println(nonFood)

        println("\nAll goods are in stock. Please Enjoy your Shopping シ ")
        println("\nThank you and come again! シ")

    }else{
            println("Thank you for visiting our shop")
        }

}
class Grocery()
var cat = arrayOf<String> ("\"Food\"", "\"Non Food\"")