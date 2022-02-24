fun main() {
    // put your code here
    val word = readLine()!!
    val characters = 'a'.rangeTo('z')
    loop@ for (char in characters) {
        for (w in word) {
            if (w == char) continue@loop
        }
        print(char)
    }
}