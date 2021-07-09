package digitalInovationOne

fun main() {
    val salarios = arrayOf(
        "3000".toBigDecimal(),
        "2500".toBigDecimal(),
        "5000".toBigDecimal()
    )
    println(salarios.somatoria())

    println("--------------")
    println(salarios.media())
}