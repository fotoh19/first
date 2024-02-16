fun main() {
//    generata large sequance
    val fooSequence = generateSequence(1){it + 1}
        .take(60).toList()
    println(fooSequence)
    println("done1!")
}