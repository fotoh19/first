fun main() {

    println("name")
    val name = readLine()!!.toString()
    println("your name is $name")
    val value = name.split(' ')
    val firstShar = name[0]
    val secchar = name[1]
    println("$firstShar,$secchar")

}
