package digitalInovationOne

fun main() {
    val values = intArrayOf(6, 3, 7, 5, 2, 4)

    values.forEach {
        println(it) // no kotlin o it referencia o que está dentro da variavel esta prática só é aceitavel se só tivermos um escopo, pois com vários escopos vai se repetir muitos it no codigo
    }

    println("---------------")
    values.sort()
    values.forEach {
        println(it)
    }
}