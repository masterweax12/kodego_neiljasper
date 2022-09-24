package excercise_activities
fun main() {
    //1st: Accept Monetary Amount until a "No" is set as input for the question "Do you want to add another amount?"
    //2nd: After the input is done, the user will be asked "Divide the value by how many?" It will only accept an Integer as input.
    //3rd: The total of the first input will be  divided by the second input
    //Note: Error checking must be done.

    //Program start with loop using for/in command. Accumulates up to 3 times adding numbers.
    var input: Double = 0.0
    for (number in 1..3) {
        print("Enter Your desired Amount: ")
        var input1: Double = readln().toDouble()
        input = input + input1
    }

    //Selecting No for the next step of dividing the first input to the second input
    println("Your Amount is $input")
    println("Do you want to add another amount? Please type: \"No\" for next step ")
    var addAmount : String = readln().toString()
    if (addAmount == "No") {
        println("Divide the value by how many?")
    }else{
        println("Error! Please select only \"No\"")
        var selectNo : String = readln().toString()
        if (selectNo == "No")
            println("Divide the Value by how many?")
    }
    //The division part
    var divideBy : Double = readln().toDouble()
    var diviDend : Double = input / divideBy

    //Total amount
    println("The total amount is $diviDend. Transaction complete thank you!")

    //end of code
}

