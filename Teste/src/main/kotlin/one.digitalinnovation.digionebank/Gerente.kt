package one.digitalinnovation.digionebank

class Gerente(
        nome: String,
        cpf: String,
        salary: Double
) : Funcionario(nome = nome, cpf = cpf, salary = salary){
    override fun calculiAuxiliary(): Double = salary * 0.4

}