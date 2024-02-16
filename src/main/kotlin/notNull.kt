fun main() {
    var name:String? = null
    val length = requireNotNull(name,{"the name shoud not be null"}).length
    println(length)
}