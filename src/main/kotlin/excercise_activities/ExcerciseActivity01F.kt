fun main() {

    println( "\"mom\" \"tell\"\n" +
            "Select a word to check if it's a Palindrome: ")
    var input: String = readln().toString()

    //if else condition
    if (input == "mom"){
        println("Palindrome")
    }else if (input == "tell"){
        println("Non Palindrome")
    }else{
        println("Invalid Word")
    }
}



