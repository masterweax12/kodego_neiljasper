package practice_activities
fun main(){
    var myPhone = PhoneClass()
    myPhone.sendSMS()
    myPhone.takePhotos()
    myPhone.playRadio()
    myPhone.gameTurbo()
    myPhone.linuxOperate()

}
//class section
class PhoneClass(var brand: String, var modelName: String, var os: String, var androidVersion: Int, var color: String){
    init {
        println("Brand: $brand")
        println("Model name: $modelName")
        println("Operating system: $os")
        println("Android version: $androidVersion")
        println("Phone Color: $color")
    }

    constructor(brand: String):this(brand = "OnePlus", "One Plus 9", "Android", 11, "Sky Blue"){}
    constructor(androidVersion:Int):this("Oppo", "OppoF5s", "Android", androidVersion, "red"){}
    constructor():this(""){}
    //behavior functions
    fun sendSMS() {
        println("This phone can send SMS.")
    }
    fun takePhotos() {
        println("This phone can take photos with a quality of 20MP.")
    }
    fun playRadio(){
        println("This phone supports playing of FM Radio.")
    }
    fun gameTurbo() {
        println("This phone can store games with it's unique feature of Game Turbo")
    }
    fun linuxOperate(){
        println("This phone has an enabled option to operate linux.")
    }



}
//end of code