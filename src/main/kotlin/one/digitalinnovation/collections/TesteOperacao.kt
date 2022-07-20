package one.digitalinnovation.collections


fun main(){
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0, 6000.0)
    salarios.forEach {
        println(it)
    }
    println("----------")

    println("Maior salario = ${salarios.max()}")
    println("Menor salario = ${salarios.min()}")
    println("Media do salario = ${salarios.average()}")
    println("----------")

    val salariosMaior2500 = salarios.filter {it > 2500}
    salariosMaior2500.forEach {
        println(it)
    }
    println("----------")
    println(salarios.count { it in 2000.0..5000.0 })        // utiliza ranger
    println("----------")
    println(salarios.find { it == 2250.0 })         //retorna o valor procurado se nao null
    println("----------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 230.0 })
}