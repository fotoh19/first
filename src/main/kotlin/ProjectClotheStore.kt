fun main() {

//  Info

    println("User Name")
    val User = readLine().toString()
    println("Receipt Code")
    val receiptCode = readLine()?.toInt()
    println("----------------------")

//      Items and quantity values

        println("Item 1")
        val item1 = readLine().toString()
        println("Quantity")
        val quantity1 = readLine()!!.toInt()
        println("Price")
        val price1 = readLine()?.toInt()
        val total1 = quantity1?.times(price1!!)
        println("------------")
        println("Item 2")
        val item2 = readLine().toString()
        println("Quantity")
        val quantity2 = readLine()?.toInt()
        println("Price")
        val price2= readLine()?.toInt()
        val total2 = quantity2?.times(price2 !!)
        println("------------")
        println("Item 3")
        val item3 = readLine().toString()
        println("Quantity")
        val quantity3 = readLine()?.toInt()
        println("Price")
        val price3 = readLine()?.toInt()
        val total3 = quantity3?.times(price3 !!)
    println("----------------------")
    println("Final Storage Info".uppercase())
    println("User Name :$User")
    println("Receipt Code :$receiptCode")
    println("---------")
    println("1-$item1 :$quantity1    ->   Total :$total1")
    println("2-$item2 :$quantity2    ->   Total :$total2")
    println("3-$item3 :$quantity3    ->   Total :$total3")
    println("---------")
    val totalQuantity = quantity1 + quantity2!! + quantity3!!
    val finalTotal:Int = total1 + total2!! + total3!!
    println("Storage quntity items : ")
    println("The store contains a value = $finalTotal")
    println("---------")
        println("thank you $User")





}
