package one.digitalinnovation.collections

fun main(){
    val nomes = Array<String>(3){""}
    nomes[0]= "Maria"
    nomes[1]= "Zaza"
    nomes[2]= "jose"

    for (nome in nomes){
        println(nome)
    }
    println("------------")

    nomes.sort()
    nomes.forEach {println(it)
    }
    println("------------")


    val nomes2 = arrayOf("Maria", "Zaza", "jose")
    nomes2.sort()
    nomes2.forEach { println(it) }






}