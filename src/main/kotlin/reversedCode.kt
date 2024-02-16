fun main(){

    val itemes3 = listOf("fotoh moh","khaled moh","khokha moh","gazara moh")
    val result3 = itemes3.map { it.substring(0,2).uppercase() }
        .reversed()
    println(result3)
}