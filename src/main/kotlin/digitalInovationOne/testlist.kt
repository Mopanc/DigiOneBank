package digitalInovationOne

fun main() {
    val jorge = Funcionario("Jorge", 1000.0)
    val gabriella = Funcionario("Gabriella", 2000.0)
    val matheus = Funcionario("Matheus", 4000.0)
    val beatriz = Funcionario("Beatriz", 4000.0)

    val funcionarios = listOf(jorge, gabriella, matheus, beatriz)

    funcionarios.forEach { println(it) }

    println("-----------")
    println(funcionarios.find { it.nome == "Matheus" })

}

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
    """
        Nome: $nome
        Salário: $salario
    """. trimIndent()
}