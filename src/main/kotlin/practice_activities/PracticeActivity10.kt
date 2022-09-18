package practice_activities
fun main(){
    var phone = SmartPhone(20.0, 60)
    buyLoad(1.0)

}
class SmartPhone(var spLoad: Double, var spBatteryPercentage: Int){


    init{
        println("Object Created!")
        println("Initial balance of load is: $spLoad and battery percentage is $spBatteryPercentage%")
    }
}
fun buyLoad(amount:Double){
    var addLoad: Double = readln().toDouble()
}