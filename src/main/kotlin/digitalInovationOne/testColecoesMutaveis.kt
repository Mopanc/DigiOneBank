package digitalInovationOne

fun main() {
    val jorge = Funcionario("Jorge", 3000.0,"clt")
    val gabriella = Funcionario("Gabriella", 2000.0,"pj")
    val matheus = Funcionario("Matheus", 4000.0,"pj")
    val beatriz = Funcionario("Beatriz", 5000.0,"clt")

    val funcionarios = mutableListOf(jorge, gabriella, beatriz)
    funcionarios.forEach { println(it) }

    println("--------------")
    funcionarios.add(matheus)
    funcionarios.forEach { println(it) }

    println("--------------")
    funcionarios.remove(gabriella)
    funcionarios.forEach { println(it) }

    println("-------Set-------")
    val funcionarioSet = mutableSetOf(gabriella)
    // funcionarioSet.forEach { println(it) }

    funcionarioSet.add(jorge)
    funcionarioSet.add(matheus)
    funcionarioSet.forEach { println(it) }

}