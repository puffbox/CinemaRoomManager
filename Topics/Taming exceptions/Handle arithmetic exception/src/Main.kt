fun main() {
    // put your code here
    val a = readLine()?.toIntOrNull() ?: return
    val b = readLine()?.toIntOrNull() ?: return
    println(if (b == 0) "Division by zero, please fix the second argument!" else a / b)
}