package excercise_activities

fun main(){

    /*
    Author Name: Neil Jasper A. Juntilla
    Date Created: 10/7/2022
    File Name: ExcerciseActivity03A.kt
     */

//Activity 01D
        println("Good Day! Would you like to add monetary? Please enter your desired amount: ")
        var amount: Double = readln().toDouble()
        var condition: Boolean = true

        try{
        //try catch for Activity 01-D
        while (condition) {
            print("Do you want to add more? Yes/No: ")
            var answer = readln()
            if(answer.isEmpty()){
                throw Exception()
            }
            if (answer == "Yes" || answer == "yes") {
                print("Enter an amount: ")
                var input = readln().toDouble()
                amount += input
            } else if (answer == "No" || answer == "no") {
                println("\nTotal amount is $amount")

                condition = false
            }
        }
        println("\nDivide the total by how many? ")
        var division = readln().toDouble()

        if (amount > 0 && division > 0) {
            var quotient = amount / division
            println("\nThe result is $quotient")
            println("\nTransaction completed")
        } else {
            println("\nInvalid Input")
            println("\nPlease Try Again")
        }
    }catch(e:NumberFormatException){
        println(e.message)
        println("Input Digits only!")
    }catch(e:ArithmeticException){
        println(e.message)
        println("Error Occurred: Zero \"0\" is not a valid digit.")
    }

//Activity 01E
    try {
        println("Enter the first word: ")
        var firstWord = readln().lowercase()
        if (firstWord.isEmpty()) {
            throw Exception()
        }

        println("Enter the second word: ")
        var secondWord = readln().lowercase()
        var firstAndSecondWord = ""
        if (secondWord.isEmpty()) {
            throw Exception()
        }

        for (firstUnique in firstWord.indices) {
            for (secondUnique in secondWord) {
                if (firstWord[firstUnique] == secondUnique) {
                    firstAndSecondWord += firstWord[firstUnique]
                }
            }
        }
        for (secondUnique in firstAndSecondWord) {
            var remove = secondUnique + ""
            firstWord = firstWord.replace(remove, "")
            secondWord = secondWord.replace(remove, "")
        }
        println("The unique character of first word is $firstWord")
        println("The unique character of second word is $secondWord")
    }catch(e:Exception){
        println(e.message)
    }

//Activity 01F
    try {
        println("Enter a word to check if it's a Palindrome: ")
        var wordOne: String = readln().lowercase()
        if (wordOne.isEmpty()) {
            throw Exception()
        }

        var wordTwo = wordOne.reversed()
        if (wordTwo.isEmpty()) {
            throw Exception()
        }

        //Logic If Else Condition
        println("Word in reversed: $wordTwo")
        if ((wordOne) == (wordTwo)) {

            println("This word is a Palindrome!")
        } else {
            println("This word is not a Palindrome!")
        }

        }catch(e:Exception){
            println(e.message)
            println("Invalid word please try again!")
        }finally{
            println("Thank you!")
        }
}