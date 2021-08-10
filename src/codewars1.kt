import kotlin.math.floor
import kotlin.math.roundToInt

fun litres(time: Double): Int {
    val litres = floor(time*0.5)
    println("Nathan must drink at least $litres")
    return litres.roundToInt()
}
