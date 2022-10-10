fun main(){
    try {
        println("Enter number 1:")
        var num1: Int = readln().toInt()
    }catch(e:Exception){
        println("Invalid Input! Digits Only!")
    }
    println("-End of Code-")




//    var numbers = arrayOf<Int>(4,2,1)             //Exception OutOfBounds
//    numbers[3]

//    println(2/0)                                     //Exception Arithmetic
}

//Exception
// - something that disrupts a normal flow of your code
// recoverable - you can handle exceptions

//Error
//unrecoverable