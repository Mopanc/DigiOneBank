package digitalInovationOne

fun main() {
    val jorge = Funcionario("Jorge", 3000.0,"clt")
    val gabriella = Funcionario("Gabriella", 2000.0,"pj")
    val matheus = Funcionario("Matheus", 4000.0,"pj")
    val beatriz = Funcionario("Beatriz", 5000.0,"clt")

    val funcionarios1 = setOf(jorge, gabriella)
    val funcionarios2 = setOf(matheus, beatriz)

    // unindo os dois grupos
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it)}

    // subtraindo um grupo de outro grupo
    println("----------")
    val funcionarios3 = setOf(jorge, gabriella, matheus, beatriz)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it)}

    // intersectando um grupo de outro grupo
    println("----------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{ println(it)}
}