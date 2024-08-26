package org.example

class Raca(
    val nome: String,
    val idiomas: List<String>,
    val bonus: Map<String, Int>
) {
    fun exibirInformacoes() {
        println("Raça: $nome")
        println("Idiomas: $idiomas")

        println("Bônus:")
        if (bonus.isNotEmpty()) {
            bonus.forEach { (atributo, valor) ->
                if (atributo == "Todos") {
                    println("  - Todos os atributos: +$valor")
                } else {
                    println("  - $atributo: +$valor")
                }
            }
        } else {
            println("  - Sem bônus adicionais.")
        }
    }

    fun aplicarBonus(habilidades: Habilidades) {
        bonus.forEach { (atributo, valor) ->
            when (atributo) {
                "Força" -> habilidades.forca += valor
                "Destreza" -> habilidades.destreza += valor
                "Constituição" -> habilidades.constituicao += valor
                "Inteligência" -> habilidades.inteligencia += valor
                "Sabedoria" -> habilidades.sabedoria += valor
                "Carisma" -> habilidades.carisma += valor
                "Todos" -> {
                    habilidades.forca += valor
                    habilidades.destreza += valor
                    habilidades.constituicao += valor
                    habilidades.inteligencia += valor
                    habilidades.sabedoria += valor
                    habilidades.carisma += valor
                }
            }
        }
        habilidades.calcularModificadores()
    }

    companion object {
        fun criarPorEscolha(escolha: String): Raca {
            return when (escolha) {
                "1" -> Raca("Anão", listOf("Comum", "Anão"), mapOf("Constituição" to 2))
                "2" -> Raca("Gnomo", listOf("Comum", "Gnômico"), mapOf("Inteligência" to 2))
                "3" -> Raca("Humano", listOf("Comum", "Humano"), mapOf("Sabedoria" to 1))
                "4" -> Raca("Elfo", listOf("Comum", "Élfico", "Dracônico"), mapOf("Destreza" to 1))
                else -> Raca("Anão", listOf("Comum", "Anão"), mapOf("Constituição" to 2))
            }
        }
    }
}
