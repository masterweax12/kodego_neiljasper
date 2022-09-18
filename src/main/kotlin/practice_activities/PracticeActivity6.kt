package practice_activities
fun main(){
    println("Enter a Word: ")
    var input : String = readln()
    palindromeChecker(input)
}

fun palindromeChecker(input:String){
    var word = input.uppercase()
    var reverse = word.reversed()

    if(word == reverse){
        println("$input is a Palindrome")
    }else{
        println("$input is not a Palindrome")
    }
}