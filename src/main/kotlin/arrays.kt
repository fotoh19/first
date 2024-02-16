fun main() {
    val item1 = arrayListOf(1,2,3,"fotoh",4)
    item1.forEach{ println(it) }
    println("================")
    val item2 = intArrayOf(1,2,3,4,5,6,7,8,9)
    item2.forEach { println(it) }
    println("================")
    val item3 = doubleArrayOf(1.2,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0)
    item3.forEach { println(it) }
    var usere = Usere(firstNam = "fotoh", lastName = "taha")
    println(usere.fullName)

}
class Usere(var firstNam:String,var lastName:String){

    var fullName = "$firstNam $lastName"
    val users = listOf(
        Usere("fotoh"),
        Usere("mohamed")
    )


    private fun Usere(firstNam: String) {
        println(firstNam)
    }

}