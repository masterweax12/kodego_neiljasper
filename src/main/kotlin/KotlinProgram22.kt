fun main(){
    println("Enter your Name: ")
    var name : String = readln().toString()

    println("Enter your Age: ")
    var age : Int = readln().toInt()

    displayNameAndAge(name, age)
}

//no return function no parameter
fun displayName(){
    println("Peter")
}
//no return with 1 parameter
fun displayMessage(msg: String){
    println("The message is \"$msg\"")
}
//no return with 2 parameters
fun displayNameAndAge(name: String,age: Int) {
    println("Your name is $name")
    println("Your age is $age")

}



//function-> methods-> stored procedure-> sub procedure

//built-in/standard function in kotlin
//abstraction

//println()
//toInt()
//readln()
//main()
//arrayOf()
//listOf()



//user-defined function
