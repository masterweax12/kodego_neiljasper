fun main(){

    var myObject = MyClass("Hello World")
    var myObject2 = MyClassInteger(25023023)
    var myGenericObject = MyGenericClass(true)

}
//Generics ->can accept any data values.
class MyGenericClass<T>(value:T){
    init{
        println(value.toString().length)
    }
}

//Non Generic
class MyClass(value: String){
    init{
        println(value.length)
    }
}

//Non Generic
class MyClassInteger(value: Int){
    init{
        println(value.toString().length)
    }
}
/*
Class -> Objects
Object -> variables
       -> function(process)
uppercase -> first letter
examples.
String
Int
 */