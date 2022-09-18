package excercise_activities
//Implement Activity 01 -  B using data structure.
/*
Author Name: シ Neil Jasper A. Juntilla シ
Date Created: September 18, 2022
File Name: ExcerciseActivity02A.kt
 */

fun main(){
    //arrayOf Int for Book Numbers
    var bookNumbers = arrayOf<Int>(0, 1, 2, 3, 4,)
    //arrayOf Int for Book Stocks
    var bookStocks = arrayOf<Int>(0, 1, 2, 3, 4)
    //arrayOf String for Book Names
    var bookNames = arrayOf<String>("\"Daily Market\"", "\"Forex Fundamentals\"", "\"The Sentiments Reports\"", "\"Smart Money Concept\"", "\"Candlesticks Chart Patters\"")

    //Books Output display
    println("Book Number ${bookNumbers[4]} with book name ${bookNames[4]} has currently ${bookStocks[4]} Stocks available.")
    println("Book Number ${bookNumbers[3]} with book name ${bookNames[3]} has currently ${bookStocks[3]} Stocks available.")
    println("Book Number ${bookNumbers[2]} with book name ${bookNames[2]} has currently ${bookStocks[2]} stocks available.")
    println("Book Number ${bookNumbers[1]} with book name ${bookNames[1]} has currently ${bookStocks[1]} stocks available.")
    println("Book Number ${bookNumbers[0]} with book name ${bookNames[0]} has currently ${bookStocks[0]} stocks available.")

    //end of code シ
}