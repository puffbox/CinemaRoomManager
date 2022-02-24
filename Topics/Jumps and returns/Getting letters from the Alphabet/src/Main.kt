fun main() {
    // put your code here
    val char = readLine()!!.first()
    for (i in 'a'..'z') {
        if (i == char) return else print(i)
    }
}