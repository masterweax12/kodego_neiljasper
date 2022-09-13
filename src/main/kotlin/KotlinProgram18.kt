fun main() {
    //declaring maps
    var map = mapOf(1 to "Peter", 2 to "Paul", 3 to "Mary")
    //getting value from map
    println(map[1])
    println(map.get(2))

    //traversing keys
    for (key in map.keys) {
        println(key)
    }
    //traversing values
    for (value in map.values) {
        println(value)
    }
    var map2 = mutableMapOf<Int, String>()
    map2.put(2, "John")
    map2.remove(2)
    println(map2)
}