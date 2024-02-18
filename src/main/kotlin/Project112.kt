import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter your name: ")
    val UserName = getString1(scanner)
    val scanner2 = Scanner(System.`in`)
    print("Enter Recipt code: ")
    val intValue = getIntFromUser1(scanner2)
    println("----------------------")
    println("Enter the total number of items:")

    val totalItems = getIntFromUser1(scanner2)


    val items = mutableListOf<IteM>()

    for (i in 1..totalItems) {
        println("Item $i:")
        print("Name: ")
        val name = getString1(scanner)
        print("Quantity: ")
        val quantity = getIntFromUser1(scanner2)
        print("Price: $")
        val price = getIntFromUser1(scanner2)
        // name, qu, price = enterUserCart()
        items.add(IteM(name, quantity, price))
    }

    println("------------------")
    for (item in items) {
        println("Name: ${item.name}, Quantity: ${item.quantity}, Price: $${item.price}")
    }
    val totalPrice1 = calculateTotalPrice(items)
    print("Enter the discount percentage ( 10 for 10% off): ")
    val discountPercentage = getIntFromUser1(scanner2)
    val discountedTotalPrice = totalPrice1 - (totalPrice1 * discountPercentage / 100)

    println("Total Price(Befor disqount): $$totalPrice1")
    println("Total Price (after ${discountPercentage}% discount): $$discountedTotalPrice")
}

data class IteM(val name: String, val quantity: Int, val price: Int)

fun getString1(scanner: Scanner): String {

    while (true) {

        val userInput = scanner.nextLine()

        try {

            userInput.toIntOrNull()?.let {
                println("Invalid input: Please enter a string value.")
            } ?: return userInput
        } catch (e: NumberFormatException) {
            println("Error: Not a valid integer. Please enter a string value.")
        }
    }
}

fun getIntFromUser1(scanner: Scanner): Int {
    while (true) {

        val userInput = scanner.nextLine()

        try {
            return userInput.toInt()
        } catch (e: NumberFormatException) {
            println("Invalid input: Please enter a valid integer.")
        }
    }
}

fun calculateTotalPrice(items: List<IteM>): Int {
    var total = 0
    for (item in items) {
        total += item.quantity * item.price
    }
    return total
}

