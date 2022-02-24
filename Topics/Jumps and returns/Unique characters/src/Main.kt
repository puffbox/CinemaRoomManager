fun main() {
    // put your code here
    val word = readLine()!!
    var check = 0
    var symbol = 0
    loop@ for (char in word) {
        for (ch in word) {
            if (char == ch) {
                check++
                if (check == 2) {
                    check = 0
                    continue@loop
                }
            }
        }
        check = 0
        symbol++
    }
    println(symbol)
}