package practice_activities

/* Name: Neil Jasper A. Juntilla
   Date: 09/06/2022
   File Name: PracticeActivity5.kt
 */

fun main(){
    var numbers = mutableListOf<Int>()

    //loop
    var ctr : Int = 0
    while(ctr < 5){
        println("Enter number ${ctr+1}")
        var input = readln().toInt()
        numbers.add(input)
        ctr++
    }

    //display list
    println("Display List")
    for(value in numbers){
        println(value)
    }

    //print in reversed
    println(numbers.reversed())

                            //end of code

}