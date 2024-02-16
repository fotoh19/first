fun main() {

    val p = PersInfo("fotoh",10)
    if (p.age < 18)
//        throw Exception("user is not enough")
    throw InvalidExiption(p.age,"user is not enough")

}
class InvalidExiption(val age:Int, massage:String):Exception("invalid age $age,$massage"){


}
data class PersInfo(val name:String ,val age:Int){

}