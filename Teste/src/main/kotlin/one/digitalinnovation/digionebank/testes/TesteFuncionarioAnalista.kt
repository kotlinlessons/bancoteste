package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista


fun main() {
    val joao = Analista(nome = "Joao", cpf = "33232323232", salary = 2000.0)
    ImprimeRelatorioFuncionario.imprimeRelatorio(joao)

}
