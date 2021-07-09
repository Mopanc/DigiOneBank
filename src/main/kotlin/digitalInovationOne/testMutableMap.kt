package digitalInovationOne

fun main() {
    val jorge = Funcionario("Jorge", 3000.0, "clt")
    val gabriella = Funcionario("Gabriella", 2000.0, "pj")
    val matheus = Funcionario("Matheus", 4000.0, "pj")
    val beatriz = Funcionario("Beatriz", 5000.0, "clt")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(jorge.nome, jorge)
    repositorio.create(gabriella.nome, gabriella)
    repositorio.create(matheus.nome, matheus)

    println(repositorio.findById(jorge.nome))

    println("---------------")
    repositorio.FindAll().forEach { println(it) }

    println("---------------")
    repositorio.remove(jorge.nome)
    repositorio.FindAll().forEach(::println)



}