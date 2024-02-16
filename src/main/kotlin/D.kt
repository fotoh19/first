class D(var firstName:String, var lastName : String) {

    var fullName:String = "$firstName $lastName"
    get() = "fullName: $field"
    set(value) {
        if (value.startsWith("ahmed")){
            field = "khed tamer"
        }else {
            field = "mohab tamer"
        }
    }
}

fun main() {
    val obj = D("fotoh","mohamed")
    println(obj.fullName)
    obj.fullName = "fotoh"
    println(obj.fullName)

}