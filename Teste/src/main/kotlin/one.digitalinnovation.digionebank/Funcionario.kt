package one.digitalinnovation.digionebank

abstract class Funcionario(
     nome: String,
     cpf: String,
    val salary: Double
) : Pessoa(nome, cpf){
    protected abstract fun calculiAuxiliary(): Double

    override fun toString(): String = """
    Nome: $nome
    Cpf:  $cpf
    Salario: $salary
    Auxilio: ${calculiAuxiliary()}
    """.trimIndent()
}