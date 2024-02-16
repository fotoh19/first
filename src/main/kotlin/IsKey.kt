fun main() {
    val age:Any = 25
    if (age is Any){
        println("it is 25")
    }else{
        println("it is not")

    }
    println(age.javaClass.name)
    val obj1 = Pers("fotoh")
    if (obj1 is Any){
        println(obj1.name)
        println("it is ".javaClass.name)

    }else 0
}
data class Pers(val name:String){

}