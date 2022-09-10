fun main(){
    var result : Int = cube(2)
    println(result)

    println(add(5, 22))
}

//function with return and 1 parameter
fun cube(number: Int):Int{
   return number * number * number
}
//function with return and 2 parameters
fun add(number1: Int, number2: Int):Int{
    println("Welcome to the add function")
    return number1+number2
}