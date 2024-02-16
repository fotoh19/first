fun main() {
    val itemes = listOf(1,2,3,4)
    itemes.forEach{ println(it) }

    println("====================")

    val users = listOf(
        User("mohemed"),
        User("taha")
    )
    users.forEach { println(it) }
    println("======================")
    val first = users.first()
    println(first)
}
class Useres(var firstName:String,var lastName:String){

}