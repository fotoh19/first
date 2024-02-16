fun main() {

    val objString:List<String> = listOf("fotoh","moh")
    val result = Box(objString)
    println(result.items())
}
class Box<T>(val list:List<T>){
    fun items():List<T>{
        return list
    }

}