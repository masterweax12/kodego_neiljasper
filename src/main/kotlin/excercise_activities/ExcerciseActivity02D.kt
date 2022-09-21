package excercise_activities



fun main(){
    println("Welcome to Hokkaido Student Directory\n")
    println("Please select between 1-3 of row numbers to access more student information.\n")
    val rowNumber: Int = readln().toInt()
    if (rowNumber ==1 ){
        println("You have selected row number [1]. ${students().studentRow1}")
    }else if (rowNumber ==2){
        println("You have selected row number [2]. ${students().studentRow2}")
    }else if (rowNumber ==3){
        println("You have selected row number [3]. ${students().studentRow3}")
    }else{
        println("The number you entered is invalid. Please try again.")
    }
    var studentLists = students()

    println("\nEnter the Letter of the student you would like to access information.")
    var letterA = studentRecords1()
    var letterB = studentRecords2()
    var letterC = studentRecords3()

}

class students{
    var studentRow1 = arrayListOf<String>("A.Tanjiro", "B.Zenitsu", "C.Inosuke")
    var studentRow2 = arrayListOf<String>("D.Nezuko", "E.Giyu", "F.Kyojuro")
    var studentRow3 = arrayListOf<String>("G.Kokushibo", "H.Sanemi", "I.Kanao")


}
fun studentRecords1(){
    val studentRow1A: String = ("Tanjiro")
    val studentRow1B: String = ("Zenitsu")
    val studentRow1C: String = ("Inosuke")

        val accessLetter1 = readln().uppercase()
    if(accessLetter1 == "A"){
        println("Name: $studentRow1A\n Age: 17\n Gender: Male\n Height: 5'7\n Average Grade: 87.5\n Hobby: Slaying demons.")
    }else if (accessLetter1 == "B"){
        println("Name: $studentRow1B\n Age: 16\n Gender: Male\n Height: 5'6\n Average Grade: 80.1\n Hobby: Stalking Nezuko.")
    }else if (accessLetter1 == "C"){
        println("Name: $studentRow1C\n Age: 19\n Gender: Male\n Height: 5'9\n Average Grade: 76.9\n Hobby: Hunting and slaying demons.")
    }
}
fun studentRecords2(){
    val studentRow2D: String = ("Nezuko")
    val studentRow2E: String = ("Giyu")
    val studentRow2F: String = ("Kyojuro")

    val accessLetter2 = readln().uppercase()
    if(accessLetter2 == "D"){
        println("Name: $studentRow2D\n Age: 15\n Gender: Female\n Height: 5'2\n Average Grade: 92.3\n Hobby: Helping alongside her brother Tanjiro.")
    }else if (accessLetter2 == "E"){
        println("Name: $studentRow2E\n Age: 20\n Gender: Male\n Height: 6'0\n Average Grade: 94.9\n Hobby: Travelling and Patrolling.")
    }else if (accessLetter2 == "F"){
        println("Name: $studentRow2F\n Age: 25\n Gender: Male\n Height: 6'1\n Average Grade: 91.5\n Hobby: Training and Meditating.")
    }
}
fun studentRecords3(){
    val studentRow3G: String = ("Kokushibo")
    val studentRow3H: String = ("Sanemi")
    val studentRow3I: String = ("Kanao")

    val accessLetter3 = readln()
    if(accessLetter3 == "G"){
        println("Name: $studentRow3G\n Age: 22\n Gender: Female\n Height: 5'3\n Average Grade: 92.6\n Hobby: Taking care of garden.")
    }else if (accessLetter3 == "H"){
        println("Name: $studentRow3H\n Age: 24\n Gender: Male\n Height: 5'9\n Average Grade: 89.5\n Hobby: Bullying other classmates.")
    }else if (accessLetter3 == "I"){
        println("Name: $studentRow3I\n Age: 18\n Gender: Female Height: 5'2\n Average Grade: 93.7\n Hobby: Collecting butterflies and helping her sister Kokushibo.")
    }
}
