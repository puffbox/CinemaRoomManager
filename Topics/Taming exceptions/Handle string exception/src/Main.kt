fun main() {
    val index = readLine()!!.toInt()
    val word = readLine()!!
    println(
        if (index in 0..word.lastIndex)
            word[index]
        else
            "There isn't such an element in the given string, please fix the index!"
    )
}