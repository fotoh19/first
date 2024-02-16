fun main() {

    val obj1:Any = getStuff("1")
    val test:Any = obj1 as Any
    println(test)
    println(test.javaClass.name)
    println("==============")
    val obj2:Boolean = getStuff("3") as Boolean
    val test2:Boolean = obj2 as Boolean
    println(test2)
    println(obj2.javaClass.name)
}
fun getStuff(value:String):Any{
    return when(value){
        "1" -> "fotoh"
        "2"-> 99
        "3" -> true
        else -> false

    }
}