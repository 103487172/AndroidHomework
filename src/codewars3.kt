fun feast(beast: String, dish: String): Boolean {
    val beastFirst = beast[0]
    val beastLast = beast[beast.lastIndex]
    val dishFirst = dish[0]
    val dishLast = dish[dish.lastIndex]
    return beastFirst == dishFirst && beastLast == dishLast
}
