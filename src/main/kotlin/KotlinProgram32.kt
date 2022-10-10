fun main(){
    println("Enter number 1: ")
    var num1 : Int = readln().toInt()

    println("Enter number 2: ")
    var num2 : Int = readln().toInt()

    println("Enter number 3:  ")
    var num3 : Int = readln().toInt()

    var total = num1 + num2 + num3
    println("The total is $total")


    try {
        println("The divide the by how many?")
        var divisor: Int = readln().toInt()
        println("The answer is ${total / divisor}")
        var myArray = arrayOf<Int>(1,2,4,2)
        myArray[5]  //array out of bounds
        println("Hellloooooooooooooooooooooooooo!")



    }catch(e:ArithmeticException){
        println(e)
        println("Division by \"0\" is not allowed!")
    }catch(e:NumberFormatException){
        println(e)
        println("Invalid input! please enter digits only.")
    }catch(e:ArrayIndexOutOfBoundsException){
        print(e)
        println("Invalid index")
    }
}