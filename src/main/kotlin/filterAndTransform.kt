fun main() {
    var items1 = mutableMapOf(
        "mo" to "mohame",
        "fo" to "fotoh",
        "ta" to "taha",
        "mo" to "mostafa",
        "ah" to "ahmed"
    )
    val filter = items1.filter { it.key.contains("a")}
    println(filter)
    println("=====================")
    val filter2 = items1.filterKeys { it.contains("a") }
    println(filter2)
//    towice up == same
    println("==========================")
//    map return value
    val filter4 = items1.filterKeys { it.contains("f") }
        .map { it.value.substring(0,2) }
    println(filter4)
    println("=========================")
//    map return key and value
    val filter5 = items1.filterKeys { it.contains("f") }
        .mapValues { it.value.substring(0,3) }
    println(filter5)
}