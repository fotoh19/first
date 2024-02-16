fun main() {
    // 1 instance
    println(FavouritFood.name)
    FavouritFood.name = "watermellon"
    println(FavouritFood.name)
    FavouritFood.list.add("salad,lemmon")
    println(FavouritFood.list.first())
    doStuff()
    println(FavouritFood.name)
}
fun doStuff(){
    FavouritFood.name = "chicken"
}
