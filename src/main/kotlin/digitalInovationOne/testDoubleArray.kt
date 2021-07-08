package digitalInovationOne

fun main() {
    val salarios = DoubleArray(5)
    salarios[0] = 1000.00
    salarios[1] = 3000.00
    salarios[2] = 7000.00
    salarios[3] = 2500.00
    salarios[4] = 10000.00

    salarios.forEach { println(it) }

    println("-----------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("-----------")
    val salarios2 = doubleArrayOf( 1500.0, 1000.0, 2500.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}
