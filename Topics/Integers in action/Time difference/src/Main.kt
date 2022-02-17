fun main() {
    // put your code here
    val a1 = readLine()!!.toInt()
    val b1 = readLine()!!.toInt()
    val c1 = readLine()!!.toInt()
    val a2 = readLine()!!.toInt()
    val b2 = readLine()!!.toInt()
    val c2 = readLine()!!.toInt()
    print((a2 - a1) * 3600 + (b2 - b1) * 60 + (c2 - c1))
}