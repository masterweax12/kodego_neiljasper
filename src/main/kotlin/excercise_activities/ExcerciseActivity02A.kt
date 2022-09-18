package excercise_activities



//Implement Activity 01 -  A using data structure.
/*
Author Name: Neil Jasper A. Juntilla
Date Created: September 18, 2022
File Name: ExcerciseActivity02A.kt
*/
fun main(){
    println("Hokkaido Students Directory\n")

    var students = arrayOf(

            arrayOf<String>("1: Tanjiro", "2: Zenitsu", "3: Inosuke"),
            arrayOf<String>("4: Nezuko", "5: Giyu", "6: Kyojuro"),
            arrayOf<String>("7: Kokushibo", "8: Sanemi", "9: Kanao"),
    )
    var row : Int = 0
    while(row <3){
        var column : Int = 0
        while(column <3){
            print(" ${students[row][column]} ")
            column++
        }
        println()
        row++
    }

}