fun main() {

    val city1 = listOf(
        Cityy("ciro"),
        Cityy("alex"),
        Cityy("loxor"),
        Cityy("tanta"),
        Cityy("fayoum")
    )

    city1.forEachIndexed{ index, cityy ->
        println("Index:$index , city:$cityy")
    }


}
data class Cityy(val name:String)