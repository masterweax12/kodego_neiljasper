fun main(){

    var names = arrayOf<String> ("John", "Paul", "Mark", "Ringo", "George")
    var ctr : Int = 0
    while(ctr < names.size) {
        println(names[ctr])

        ctr++
    }

    //equivalent to 5 prints
//    println(names[0])
//    println(names[1])
//    println(names[2])
//    println(names[3])
//    println(names[4])

    //display new array values
    var ctr2 : Int = 0
    while(ctr2 <names.size){
        println(names[ctr2])

        ctr2++
    }

}