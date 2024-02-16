fun main() {
    val names = listOf("mohamed", "fotoh", "khaled", "fotoh")
    val filter = names.filterNot { it.contains("h") }
    println(filter)
}