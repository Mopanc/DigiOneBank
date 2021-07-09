package digitalInovationOne

fun main() {
    val pair: Pair<String, Double> = Pair("Jorge", 1000.0)
    val map1= mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Gabriella" to 2500.0, //sintax com recurso infix
        "Matheus" to 4000.0
    )

    println("--------")
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}