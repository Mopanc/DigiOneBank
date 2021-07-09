package digitalInovationOne

fun main() {
    val jorge = Funcionario("Jorge", 3000.0,"clt")
    val gabriella = Funcionario("Gabriella", 2000.0,"pj")
    val matheus = Funcionario("Matheus", 4000.0,"pj")
    val beatriz = Funcionario("Beatriz", 5000.0,"clt")

    val funcionarios = listOf(jorge, gabriella, matheus, beatriz)

    funcionarios.forEach { println(it) }

    println("-----------")
    println(funcionarios.find { it.nome == "Matheus" })

    println("-----------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("-----------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
    """
        Nome: $nome
        Salário: $salario
    """. trimIndent()
}