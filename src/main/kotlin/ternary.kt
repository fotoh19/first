fun main() {
    val name:String? = null
    val length = if (name != null) name.length else 0
    println(length)
}