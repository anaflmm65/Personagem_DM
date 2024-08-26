//aplicação do strategy
interface ClasseStrategy {
    val nome: String
    val proficiencias: List<String>
    val dadoDeVida: String

    fun calcularPontosDeVida(modificadorConstituicao: Int): Int
    fun exibirInformacoes()
}
