fun main() {

    val names = mapOf(
        1 to "mohame",
        2 to "fotoh",
        3 to "taha",
        4 to "mostafa",
        5 to "ahmed"

    )
//    val result = names.get(3) same of this down
    val result = names[3]
    println(result)
//    val result2 = names[7] will print null
    println("======================")
    val result2 = names.containsKey(4)
    println(result2)
    println("======================")
//    this print py string and get boolean result
    val result3 = names.containsValue("fotoh")
    println(result3)
    println("======================")
//    this entries print all key and value in one methods
    val result4 = names.entries
    println(result4)
    println("======================")

}