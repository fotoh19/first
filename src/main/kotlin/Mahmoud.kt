fun main() {
    val obj = Nested()
    obj.sayHi = "hi"

    val obj1 = obj.NestedTow()
    obj1.Info()
    val obj2 = Nested.Nestedthree()
    obj2.Info()
}
class Nested{
    var sayHi:String = ""
    inner class NestedTow{

        var name:String = "${sayHi}this is class nested tow"
        fun Info()= println(name)

    }
    class Nestedthree{

        var name:String = "this is class nested three"
        fun Info()= println(name)

    }
}