package one.digitalinnovation.collections

fun main(){
    val traco = "------------"
    val value = IntArray(5)

    value[0]= 1
    value[1]= 7
    value[2]= 6
    value[3]= 3
    value[4]= 2

    for (valor in value){
        println(valor)
    }
    println(traco)

    value.forEach {
        println(it)
    }
    println(traco)

    value.forEach {valor ->
        println(valor)
    }
    println(traco)

    for (index in value.indices)
        println(value[index])
    println(traco)

    value.sort()
    for (valor in value){
        println(valor)
    }


}

