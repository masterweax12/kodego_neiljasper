package excercise_activities
fun main() {
    /*
    Author Name: Neil Jasper A. Juntilla
    Date: 9/4/2022
    File Name: ExcerciseActivity01F.kt
    */

    println("Enter a word to check if it's a Palindrome")
    var word: String = readln().uppercase()

    var secondWord = word.reversed()

    //Logic If Else Condition
    println("Word in reversed: $secondWord")
    if ((word) == (secondWord)) {

        println("This word is a Palindrome!")
    }else{
        println("This word is not a Palindrome!")
    }
}




