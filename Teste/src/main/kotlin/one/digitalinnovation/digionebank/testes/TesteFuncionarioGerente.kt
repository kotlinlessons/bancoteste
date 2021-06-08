package one.digitalinnovation.digionebank.testes


import one.digitalinnovation.digionebank.Gerente

fun main() {
    val Pedro = Gerente(nome = "Pedro", cpf = "3333333333", salary = 5000.0)
   ImprimeRelatorioFuncionario.imprimeRelatorio(Pedro)

}
