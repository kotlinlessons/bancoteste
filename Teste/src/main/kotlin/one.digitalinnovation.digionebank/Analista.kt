package one.digitalinnovation.digionebank


class Analista(
    nome: String,
    cpf: String,
    salary: Double
) : Funcionario(nome, cpf, salary) {
    override fun calculiAuxiliary() = (salary * 0.1)


}