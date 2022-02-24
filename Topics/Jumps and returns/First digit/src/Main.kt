fun main() {
    // put your code here
    val digit = readLine()!!
    for (i in digit) {
        if (i.isDigit()) {
            println(i)
            break
        } else continue

    }
}