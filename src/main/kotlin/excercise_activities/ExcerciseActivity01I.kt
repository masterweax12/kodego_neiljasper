fun main() {
    println("Welcome to NJ Shop!")

    println("\nWhat category of item would you like to order? Food or NonFood?")
    var answer: String = readln()

    //Food Category
    var food1: String = "Rice"
    var food2: String = "Fresh meat"
    var food3: String = "Bread"
    var food4: String = "Sugar"
    var food5: String = "Biscuit Snacks"

    //NonFood category
    var nonFood1: String = "Detergent"
    var nonFood2: String = "Sanitary"
    var nonFood3: String = "Plastic Containers"
    var nonFood4: String = "Utensils"
    var nonFood5: String = "Floor Wax"

    if (answer == "Food") {
        println("You have selected Food. Check our items below: ")
        println("$food1, $food2, $food3, $food4, $food5")
        println("What is your order?: ")
        var foodOrder: String = readln()
        if (foodOrder == food1) {
            println("Your order $foodOrder has been successfully placed! Thank you for shopping.")
        } else if (foodOrder == food2) {
            println("Your order $foodOrder has been successfully placed! Thank you for shopping.")
        } else if (foodOrder == food3) {
            println("Your order $foodOrder has been successfully placed! Thank you for shopping.")
        } else if (foodOrder == food4) {
            println("Your order $foodOrder has been successfully placed! Thank you for shopping.")
        } else if (foodOrder == food5) {
            println("Your order $foodOrder has been successfully placed! Thank you for shopping.")
        } else {
            println("Invalid Keyword Selection! Please try again.")
        }
    }



    if (answer == "NonFood") {
        println("You have selected NonFood. Check our items below: ")
        println("$nonFood1, $nonFood2, $nonFood3, $nonFood4, $nonFood5")
        println("What is your order?: ")
        var nonFoodorder: String = readln()
        if (nonFoodorder == nonFood1) {
            println("Your order $nonFoodorder has been successfully placed! Thank you for shopping.")
        } else if (nonFoodorder == nonFood2) {
            println("Your order $nonFoodorder has been successfully placed! Thank you for shopping.")
        } else if (nonFoodorder == nonFood3) {
            println("Your order $nonFoodorder has been successfully placed! Thank you for shopping.")
        } else if (nonFoodorder == nonFood4) {
            println("Your order $nonFoodorder has been successfully placed! Thank you for shopping.")
        } else if (nonFoodorder == nonFood5) {
            println("Your order $nonFoodorder has been successfully placed! Thank you for shopping.")
        } else {
            println("Invalid Keyword Selection!. Please try again.")
        }
    }
}


