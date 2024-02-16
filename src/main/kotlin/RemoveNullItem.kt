fun main() {
    var items2 = mutableMapOf(
        "mo" to "mohame",
        "fo" to "fotoh",
        "ta" to "taha",
        "mo" to "mostafa",
        "ah" to "ahmed"
    )
//    this print null values
    val result0 = items2.map (::findValue)
    println(result0)
    println("===================")
//    this delete all null values
    val result00 = items2.mapNotNull(::findValue)
    println(result00)
}
fun findValue(entry:Map.Entry<String,String>):Map.Entry<String,String>?{
    if (entry.key.startsWith("f")) {
        return null
    }else{
        return entry
    }


}