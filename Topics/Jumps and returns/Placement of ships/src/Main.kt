fun main() {
    // put your code here
    val (line1, column1) = readLine()!!.split(" ").map { it.toInt() }
    val (line2, column2) = readLine()!!.split(" ").map { it.toInt() }
    val (line3, column3) = readLine()!!.split(" ").map { it.toInt() }

    val rows = mutableListOf<Int>()
    val column = mutableListOf<Int>()

    for (i in 1..5) {
        if (i != line1 && i != line2 && i != line3) rows.add(i)
        if (i != column1 && i != column2 && i != column3) column.add(i) else continue
    }

    println(rows.joinToString(" "))
    println(column.joinToString(" "))
}