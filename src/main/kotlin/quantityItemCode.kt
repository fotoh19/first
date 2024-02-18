fun main() {

    println("Enter the total number of items:")
    val totalItems = readLine()!!.toInt()

    val items = mutableListOf<Item>()

    for (i in 1..totalItems) {
        println("Item $i:")
        print("Name: ")
        val name = readLine()!!.toString()
        print("Quantity: ")
        val quantity = readLine()!!.toInt()
        print("Price: $")
        val price = readLine()!!.toDouble()

        items.add(Item(name, quantity, price))
    }
    println("----------------")
    println("Items entered:")
    for (item in items) {
        println("Name: ${item.name}, Quantity: ${item.quantity}, Price: $${item.price}")
    }
}
data class Item(val name: String, val quantity: Int, val price: Double)