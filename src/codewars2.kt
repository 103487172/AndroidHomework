fun main(){
    when(val month = readLine()!!.toInt()){
        in 3 downTo 1 -> println("month No.$month is part of 1st quarter")
        in 6 downTo 4 -> println("month No.$month is part of 2nd quarter")
        in 9 downTo 7 -> println("month No.$month is part of 3rd quarter")
        in 12 downTo 10 -> println("month No.$month is part of 4th quarter")
    }
}
