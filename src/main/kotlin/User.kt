
class User constructor(var firstName:String,var lastName:String,var isPlatinum:Boolean) {

    constructor(firstName: String,lastName: String):this(firstName, lastName, false){

        println("2nd")
    }
    constructor(firstName: String):this(firstName,"None"){

        println("3rd")
    }


    fun printFullName(){

        println("$firstName $lastName")
    }
    fun printWithPrefix(Prefix:String){
        println("$Prefix $firstName")


    }
    fun updateName(newName:String){
        firstName = newName

    }
    fun firstNameLength(){

        println(firstName.length)

    }



}
class Nick constructor(var firstNamee:String,var lastNamee:String){

    fun printFullNick(){
        println("$firstNamee $lastNamee")
    }
}

