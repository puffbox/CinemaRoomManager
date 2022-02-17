fun main() {
    // put your code here
    val days = readLine()!!.toInt()
    val foodcost = readLine()!!.toInt()
    val flightcost = readLine()!!.toInt()
    val nightcost = readLine()!!.toInt()
    print(days * foodcost + flightcost * 2 + (days - 1) * nightcost)
}