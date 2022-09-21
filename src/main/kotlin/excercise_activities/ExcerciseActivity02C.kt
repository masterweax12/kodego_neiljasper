package excercise_activities
fun main(){

    /*
Author Name: シ Neil Jasper A. Juntilla シ
Date Created: September 18, 2022
File Name: ExcerciseActivity02C.kt
 */

    println("Groceries Goods and Stocks Lists\n")
    var cat = arrayOf<String> ("\"Food\"", "\"Non Food\"")
    for (category in cat)
        println(category)

    //categories for food
    println("Categories: ${cat[0]}")
    var foods = arrayOf<String> ("Rice", "Fresh meat", "Bread", "Sugar", "Biscuit", "Snacks")
    for(food in foods){
        println(food)
    }

    //categories for non food
    println("\nCategories: ${cat[1]}")
    var nonFoods = arrayOf<String> ("Detergent", "Sanitary", "Plastic Containers", "Utensils", "Floor Wax")
    for (nonFood in nonFoods)
        println(nonFood)

    println("\nAll goods are in stock. Please Enjoy your Shopping シ ")
    println("\nThank you and come again! シ")

    //end of code
}