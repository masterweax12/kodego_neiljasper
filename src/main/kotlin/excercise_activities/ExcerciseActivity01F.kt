fun main() {
    println("Enter a word to check if it's a Palindrome")
    var word: String = readln().reversed()
    println("Word: $word")

    println("Type the reversed word: ")
    if (word == readln().reversed()) {
        println("This Word is a Palindrome!")

    }else{
        println("This word is not a Palindrome!")
    }
}




