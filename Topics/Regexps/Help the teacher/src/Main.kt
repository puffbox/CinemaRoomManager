fun main() {
    val report = readLine()!!
    //write your code here.
    val check = Regex(". wrong answers?")
    println(report.matches(check))
}