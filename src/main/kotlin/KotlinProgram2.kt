fun main (){
    var string1 : String = "this is my String"
    var string2 : String = "This is my String too!"
    var string3 : String = "This is my String"

    //String character
    println(string1[11])

    //String length
    println(string1.length)
    println(string2.length)

    //string equality
    println(string1 == string3)

    //string uppercase
    println(string2.uppercase())

    //string lowercase
    println(string2.lowercase())

    //startswith
    println(string2.startsWith("tha"))

    //endswith
    println(string2.endsWith("too!"))

    //concatenate
    println(string1+" "+string2)

    //substring
    println(string1.substring(6,10))

    //replace
    println(string1.replace("this", "that"))
}