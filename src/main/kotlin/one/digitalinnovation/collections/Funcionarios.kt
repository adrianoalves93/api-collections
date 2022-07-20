package one.digitalinnovation.collections

data class Funcionarios (
    val nome:String,
    val salario:Double,
    val tipoContratacao:String)
{
    override fun toString() ="""
        Nome:    $nome
        Salario: $salario
    """.trimIndent()
}