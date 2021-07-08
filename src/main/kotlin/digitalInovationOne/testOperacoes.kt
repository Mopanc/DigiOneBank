package digitalInovationOne

fun main() {
    val salarios = doubleArrayOf(5000.0, 1500.0, 2000.0, 2500.0)

    for (salario in salarios) {
        println(salario)
    }
    println("------------")
    println("Maior Salário: ${salarios.maxOrNull()}")
    println("Menor Salário: ${salarios.minOrNull()}")
    println("Média Salárial: ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter { it >= 2500 }
    println("------------")
    salarioMaiorQue2500.forEach { println(it) }
}