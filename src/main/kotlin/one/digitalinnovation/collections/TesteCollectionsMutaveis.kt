package one.digitalinnovation.collections

fun  main() {
    val joao = Funcionarios("Joao", 2000.0, "CLT")
    val pedro = Funcionarios("Pedro", 1500.0, "PJ")
    val maria = Funcionarios("Maria", 4000.0, "CLT")

    println("----------LIST----------------")
    val funcionarios = mutableListOf(joao, maria)
        funcionarios.forEach{
            println(it)
        }
    println("-------------------")
    funcionarios.add(pedro)
    funcionarios.forEach{
        println(it)
    }
    println("-------------------")
    funcionarios.remove(joao)
    funcionarios.forEach {
        println(it)
    }
    println("--------SET-----------")

    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach{
        println(it)
    }
    println("-------------------")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach{
        println(it)
    }
    println("-------------------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach{
        println(it)
    }


}