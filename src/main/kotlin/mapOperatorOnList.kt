fun main() {
//    val names = listOf("mohamed", "fotoh", "khaled", "fotoh")
//    val result = names.map { it.substring(0,3).uppercase() }
//    println(result)
//    println("=================")
    val itemes2 = listOf("fotoh moh","khaled moh","khokha moh","gazara moh")
    val result2 = itemes2.map {
        val words = it.split(' ')
        words[0].substring(0,1) + words[1].substring(0,1)
    }
    println(result2)
    println("==================")
    val itemes3 = listOf("fotoh moh","khaled moh","khokha moh","gazara moh")
    val result3 = itemes3.map { it.substring(0,2).uppercase() }
        .reversed()
    println(result3)
}
