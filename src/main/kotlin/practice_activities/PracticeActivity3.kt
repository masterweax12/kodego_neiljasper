package PracticeActivity3
fun main(){
    print("Enter age: ")
    var ageGroup : Int = 50
    if ((ageGroup >= 1)&&(ageGroup <=17)) {
        print("Under Age")
    }else if ((ageGroup >=18)&&(ageGroup <=30)){
        println("Young adult")
    }else if ((ageGroup >=31)&&(ageGroup <=59)){
        println ("Adult")
    }else if (ageGroup > 60 ){
        println("Senior")
    }else if(ageGroup <=0) {
        println("Invalid age")
    }
}