fun main() {
//  this tow fun  = us the second name is lambda
    fun greating(name:String,age:Int):String{
        return "hello $name,your age is $age"
    }
    val test1 = greating("fotoh",25)
    println(test1)
    println("=====================")
    val greating:(String,Int) -> String = {name:String,age:Int -> "hello $name,your age is $age"}
    val test = greating("fotoh",25)
    println(test)
}