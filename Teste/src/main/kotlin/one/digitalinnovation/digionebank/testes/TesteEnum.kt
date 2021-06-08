package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().iterator().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().iterator().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println("--> ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("--> ${pj.name} - ${pj.descricao}")
}