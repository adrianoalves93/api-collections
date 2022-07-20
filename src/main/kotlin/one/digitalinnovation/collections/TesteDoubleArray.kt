package one.digitalinnovation.collections

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1]= 3000.0
    salarios[2]= 500.0

    salarios.forEach {
        println(it)
    }
    println("----------")
    salarios.forEachIndexed { index, salario ->
        println(salarios[index] * 1.1)
    }
    println("----------")

    val salarios2 = doubleArrayOf(1000.0,3000.0, 500.0)
    salarios2.sort()
    salarios2.forEach {
        println(it)
    }

}