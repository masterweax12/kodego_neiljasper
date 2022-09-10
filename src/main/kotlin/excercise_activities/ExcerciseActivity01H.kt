fun main(){
    println("Welcome to our School Library\n")
    println("Enter the book number. Book Numbers range only from 1-5: ")
    var input : Int = readln().toInt()

    //School Library Books
    var bookNumber5 : Int = 5
    var bookNumber4 : Int = 4
    var bookNumber3 : Int = 3
    var bookNumber2 : Int = 2
    var bookNumber1 : Int = 1

    //Book Stocks
    var bookStocks5 : Int = 23
    var bookStocks4 : Int = 21
    var bookStocks3 : Int = 47
    var bookStocks2 : Int = 12
    var bookStocks1 : Int = 8

    //Book Name
    var bookName5 : String = "\"Daily Market\""
    var bookName4 : String = "\"Forex Fundamentals\""
    var bookName3 : String = "\"The Sentiments Report\""
    var bookName2 : String = "\"Smart Money Concept\""
    var bookName1 : String = "\"CandleSticks Chart Pattern\""

    println("You have selected the Book number: $input\n")
    if(input == bookNumber5){
        print("Available stock for Book number $input named: $bookName5 has currently \"$bookStocks5\" stocks available.\n")
    }else if(input == bookNumber4){
        println("Available stock for Book number $input named: $bookName4 has currently \"$bookStocks4\" stocks available.\n")
    }else if(input == bookNumber3){
        println("Available stock for Book number $input named: $bookName3 has currently \"$bookStocks3\" stocks available.\n")
    }else if(input == bookNumber2){
        println("Available stock for Book number $input named: $bookName2 has currently \"$bookStocks2\" stocks available.\n")
    }else if(input == bookNumber1){
        println("Available stock for Book number $input named: $bookName1 has currently \"$bookStocks1\" stocks available.\n")
    }else{
        println("Invalid Input! Numbers are ranging only from 1-5")
    }

    println("Would you like to proceed to borrow the book: $input? Answer either Yes/No")
    var answer : String = readln().toString()
    var answerYes : String = "Yes"
    var answerNo : String = "No"

    if(answer == answerYes){
        println("Thank you for borrowing this Book. Enjoy!")
    }else if(answer == answerNo){
        println("Understood. Feel free to visit our Library for more books. Have a nice Day!")
    }else{
        println("Invalid Keyword")
    }

    //end of code
}