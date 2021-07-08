package digitalInovationOne

fun main() {
    val nomes = Array(5) {""}
    nomes[0] = "Jorge"
    nomes[1] = "Gabriella"
    nomes[2] = "Matheus"
    nomes[3] = "Rodrigues"
    nomes[4] = "Morais"

    for (nome in nomes) {
        println(nome)
    }
    println("----------------")
    nomes.sort()
    nomes.forEach { println(it) }


    // outra forma de declarar uma array menos verbosa
    val nomes2 = arrayOf("Jorge", "Gabriella", "Matheus")
    println("----------------")
    nomes2.sort()
    nomes2.forEach { println(it) }
}