fun main() {
    val item = mutableListOf(1,2,3,4,5)
    item.forEach{println(it)}
    println("==================")
    item.add(6)
    item.forEach { println(it) }
    item.add(6,50)
    item.forEach{ println(it) }
    println("=====================")
    item.remove(50)
    item.forEach { println(it) }
    println("=====================")
    item.removeAt(3)
    item.forEach { println(it) }

}