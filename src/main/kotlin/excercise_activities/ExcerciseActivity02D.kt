package excercise_activities



fun main(){
    val studentLists = Students()
    println("Welcome to Hokkaido Student Directory\n")
    println("Please select between 1-3 of row numbers to access more student information.\n")
    val rowNumber: Int = readln().toInt()
    if (rowNumber ==1 ){
        println("You have selected row number [1]. ${studentLists.studentRow1}")
        println("\nEnter the Letter of the student you would like to access information.")
        val accessLetter = readln().uppercase()
        studentLists.showStudentRecord1(accessLetter)
    }else if (rowNumber ==2){
        println("You have selected row number [2]. ${studentLists.studentRow2}")
        println("\nEnter the Letter of the student you would like to access information.")
        val accessLetter = readln().uppercase()
        studentLists.showStudentRecord2(accessLetter)
    }else if (rowNumber ==3){
        println("You have selected row number [3]. ${studentLists.studentRow3}")
        println("\nEnter the Letter of the student you would like to access information.")
        val accessLetter = readln().uppercase()
        studentLists.showStudentRecord3(accessLetter)
    }else{
        println("The number you entered is invalid. Please try again.")
    }


}

class Students {
    var studentRow1 = arrayListOf<String>("A.Tanjiro", "B.Zenitsu", "C.Inosuke")
    var studentRow2 = arrayListOf<String>("D.Nezuko", "E.Giyu", "F.Kyojuro")
    var studentRow3 = arrayListOf<String>("G.Kokushibo", "H.Sanemi", "I.Kanao")


    fun showStudentRecord1(accessLetter: String) {


        if (accessLetter == "A") {
            println("Name: ${studentRow1[0]}\n Age: 17\n Gender: Male\n Height: 5'7\n Average Grade: 87.5\n Hobby: Slaying demons.")
        } else if (accessLetter == "B") {
            println("Name: ${studentRow1[1]}\n Age: 16\n Gender: Male\n Height: 5'6\n Average Grade: 80.1\n Hobby: Stalking Nezuko.")
        } else if (accessLetter == "C") {
            println("Name: ${studentRow1[2]}\n Age: 19\n Gender: Male\n Height: 5'9\n Average Grade: 76.9\n Hobby: Hunting and slaying demons.")
        }
    }

    fun showStudentRecord2(accessLetter: String) {

        if (accessLetter == "D") {
            println("Name: ${studentRow2[0]}\n Age: 15\n Gender: Female\n Height: 5'2\n Average Grade: 92.3\n Hobby: Helping alongside her brother Tanjiro.")
        } else if (accessLetter == "E") {
            println("Name: ${studentRow2[1]}\n Age: 20\n Gender: Male\n Height: 6'0\n Average Grade: 94.9\n Hobby: Travelling and Patrolling.")
        } else if (accessLetter == "F") {
            println("Name: ${studentRow2[2]}\n Age: 25\n Gender: Male\n Height: 6'1\n Average Grade: 91.5\n Hobby: Training and Meditating.")
        }
    }

    fun showStudentRecord3(accessLetter: String) {

        if (accessLetter == "G") {
            println("Name: ${studentRow3[0]}\n Age: 22\n Gender: Female\n Height: 5'3\n Average Grade: 92.6\n Hobby: Taking care of garden.")
        } else if (accessLetter == "H") {
            println("Name: ${studentRow3[1]}\n Age: 24\n Gender: Male\n Height: 5'9\n Average Grade: 89.5\n Hobby: Bullying other classmates.")
        } else if (accessLetter == "I"){
            println("Name: ${studentRow3[2]}\n Age: 18\n Gender: Female Height: 5'2\n Average Grade: 93.7\n Hobby: Collecting butterflies and helping her sister Kokushibo.")
        }
    }
}