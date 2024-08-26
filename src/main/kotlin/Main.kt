package org.example

fun main() {
    println("Escolha uma Raça:")
    println("1. Anão")
    println("2. Gnomo")
    println("3. Humano")
    println("4. Mago")

    val racaEscolhida = readLine() ?: "1"
    val raca = Raca.criarPorEscolha(racaEscolhida)

    println("\nEscolha uma Classe:")
    println("1. Guerreiro")
    println("2. Ladino")

    val classeEscolhida = readLine() ?: "1"
    val classe = Classes.criarPorEscolha(classeEscolhida)

    val habilidades = Habilidades()

    val personagem = Personagem(raca, classe, habilidades)

    println("\nInformações do Personagem:")
    personagem.exibirInformacoesRaca()
    personagem.exibirInformacoesClasse()
    personagem.exibirHabilidades()
    personagem.exibirInformacoesPontosDeVida()
}
