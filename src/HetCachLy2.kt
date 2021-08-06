fun main(){
    val Month = readLine()!!.toInt()
    println("Input Month: $Month")
    val Year = readLine()!!.toInt()
    println("Input Year: $Year")
    if (Month in listOf(1,3,5,7,8,10,12))
        println("31-day month")
    if (Month in listOf(4,6,9,11))
        println("30-day month")
    val a = Year % 4
    if (a == 0 && Month == 2)
        println("29 days")
    else if (a != 0 && Month == 2)
        println("28 days")
}
