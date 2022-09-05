fun main(){

    //First Name input
    println("Enter Your First Name: ")
    var firstName : String = readln().toString()

    //Middle Name input
    println("Enter Your Middle Name:")
    var middleName : String = readln().toString()

    //Last Name input
    println("Enter Your Last Name:")
    var lastName : String = readln().toString()

    var fullName : String = firstName + middleName + lastName
    print("Your Name is: $firstName $middleName $lastName")

    //End of code

}