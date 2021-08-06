fun main(){
    val a = readLine()!!.toDouble()
    println("Oral test score: $a")
    val b = readLine()!!.toDouble()
    println("15 minutes test score: $b")
    val c = readLine()!!.toDouble()
    println("Period test score: $c")
    val d = readLine()!!.toDouble()
    println("Semester test score: $d")
    val averagescore: Double = (a + b + c*2 + d*3)/7
    println("Average score is $averagescore")
    if (averagescore > 8)
        println("Duoc HSG")
    else if (averagescore in 6.5..7.9)
        println("Duoc HSK")
    else if (averagescore < 6.5)
        println("...")
}
