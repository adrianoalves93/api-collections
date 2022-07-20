package one.digitalinnovation.collections

fun main(){
    val traco = "------------"
    val values = IntArray(5)

    values[0]= 1
    values[1]= 7
    values[2]= 6
    values[3]= 3
    values[4]= 2

    for (valor in values){
        println(valor)
    }
    println(traco)

    values.forEach {
        println(it)
    }
    println(traco)

    values.forEach { valor ->
        println(valor)
    }
    println(traco)

    for (index in values.indices)
        println(values[index])
    println(traco)

    values.sort()
    for (valor in values){
        println(valor)
    }


}

