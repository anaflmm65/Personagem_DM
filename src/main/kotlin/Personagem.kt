package org.example

class Personagem(
    private val raca: Raca,
    private val classe: Classes,
    private val habilidades: Habilidades
) {
    private val dadoDeVida: String = classe.dadoDeVida
    private var pontosDeVida: Int = 0

    init {
        habilidades.aplicarBonusRacial(raca)
        pontosDeVida = calcularPontosDeVida()
    }

    private fun calcularPontosDeVida(): Int {
        val valorMaximo = when (dadoDeVida) {
            "d8" -> 8
            "d6" -> 6
            else -> 10
        }
        return valorMaximo + habilidades.modificadorConstituicao
    }

    fun exibirInformacoesPontosDeVida() {
        println("Tipo de Dado de Vida: $dadoDeVida")
        println("Pontos de Vida: $pontosDeVida")
    }

    fun exibirInformacoesRaca() {
        raca.exibirInformacoes()
    }

    fun exibirInformacoesClasse() {
        classe.exibirInformacoes()
    }

    fun exibirHabilidades() {
        habilidades.exibirHabilidades()
    }
}
