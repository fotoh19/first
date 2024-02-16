fun main() {

    val i = Info("fotoh",9)
    try {
        checkAge(i)
        println("done")

    }
    catch (ex:Exception){
        when(ex){
            is NullPointerException -> println("null pointer ex")
            is IllegalArgumentException -> println("Ill arg ex")
            else -> throw ex
        }

        println("this is exeption")
    }

}
private fun checkAge(p:Info){
    if (p.age<18)
        throw Exception("Eror")
    class cusExp(val age: Int,massege:String):IllegalArgumentException("invalid age:$age $massege")
}
data class Info(val name:String,val age:Int){

}