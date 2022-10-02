fun main() {
    println("<-------------------------------------------->")
    println("Welcome to our School Library.")
    println("Would you like to borrow a book? Select \"Yes\". to Show available books.")
    var booksClass = Books()
    var input: String = readln()
    while (input == "Yes") {
        println("Below are the available books you can borrow")
        println("${booksClass.bookLists}\n Would you like to borrow a book? Select \"Yes\".")
        var borrowBook: String = readln().toString()
        if (borrowBook == "Yes") {
            print("Enter the Book's name: ")
            var booksName: String = readln()
            if (booksClass.bookLists.contains(booksName)) {
                println("The book $booksName, is available. Type \"Confirm\" if you wish to borrow. Type \"No\" to cancel.")
                var conFirmOrNo: String = readln()
                if(conFirmOrNo == "Confirm"){
                    println("You have borrowed $booksName, Thank you and come again.")
                }else if(conFirmOrNo == "No"){
                    println("Selection Canceled. Thank you and come again.")
                }else{
                    println("Invalid Input!")
                }

                } else {
                    println("Book does not Exist!")
                }
                println("Do you want to enter again? Type your answer")
                input = readln()
                if(input == "No"){
                    println("Thank you and come again.")
                break
            }
        }
    }
}

class Books(){
    var bookLists = arrayListOf<String>("Daily Market", "Forex Fundamentals", "The Sentiments Reports", "Smart Money Concept", "Candlesticks chart patterns")

}