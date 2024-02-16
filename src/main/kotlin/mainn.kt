fun main() {

    var user = User("mohamed", "3b3aty")
    user.printFullName()

    println("===============================")

    var user2 = User("mohamed", "3b3aty")
    user2.printFullName()
    user2.updateName("fotoh")
    user2.printWithPrefix("MR,")
    user2.firstNameLength()

    println("===============================")

    var user3 = User("mohamed", "3b3aty")
    user3.printFullName()
    user3.printWithPrefix("MR,")
    user3.firstNameLength()
}





