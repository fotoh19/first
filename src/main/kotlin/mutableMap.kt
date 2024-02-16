fun main() {
    val names2 = mutableMapOf(
        1 to "mohame",
        2 to "fotoh",
        3 to "taha",
        4 to "mostafa",
        5 to "ahmed"
    )
//    can add key and value in map by put method
    names2.put(6,"khaled")
    println(names2)
    println("===================")
//    can remove by remove method
    names2.remove(5)
    println(names2)
    println("==============")
//    to rplace or get the new value and key if it not have
    names2.getOrPut(5,{"tarek"})
    println(names2)
    names2.getOrPut(1,{"mohamed"})
}