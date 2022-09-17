fun main(){

}

class Empty{}

class Outer{

    val name = "Outer"
    fun show() = "the name: $name"

    class Nested{
        val name = "Nested"
        fun show() = "the name: $name"
    }
}

class Outer2{

    val name1 = "Outer2"
    fun show() = "the name: $name1"

    inner class Inner{
        val name2 = "Inner"
        fun show() = "data: $name2 and $name1"
    }
}

//sealed class
//open class
//abstract class
//data class