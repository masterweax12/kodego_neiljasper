package practice_activities
fun main(){
    var myPhone = XiaomiPhone()
    myPhone.attributes()
    println(myPhone.attributes())
    myPhone.behaviors()
    println(myPhone.behaviors())


}
    //class section
class XiaomiPhone{
    var modelName: String = "Redmi 9T"
    var operatingSystem: String = "Android"
    var androidVersion: Int = 11

    //initial values
    init{
        println("Object Created!")
        println("Model name: $modelName")
        println("Operating system: $operatingSystem")
        println("Android version: $androidVersion")

    //attributes function
    }
    fun attributes(){
        var miuiVersion: Int = 12
        var ram: Int = 8
        var rom: Int = 128
        var clockSpeed: Double = 2.0
        var inch: Double = 6.7
        println("MIUI Version: $miuiVersion")
        println("RAM: $ram")
        println("ROM: $rom")
        println("Clockspeed: $clockSpeed Ghz")
        println("Inch Display: $inch inches")
    }

    //behavior functions
    fun behaviors(){
        var fingerPrint: String = "Sidemounted"
            println("Finger print $fingerPrint, runs smoothly estimated 50 milliseconds")
        var AnTuTu: String = "177917"
            println("Total benchmark score went up to $AnTuTu.")
        var reverseCharging: Double = 2.5
            println("Has a unique feature of Reverse Charging up to $reverseCharging")
        var processor: String = "Qualcomm SM6115 Snapdragon 662 (11nm)"
            println("Chipset runs on $processor.")
        var wirelessTransaction: Boolean = true
            println("Is NFC enabled? $wirelessTransaction")


    }

}
                        //end of code