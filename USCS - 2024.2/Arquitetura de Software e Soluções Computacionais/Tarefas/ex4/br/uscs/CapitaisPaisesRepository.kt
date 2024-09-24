package ex4.br.uscs

open class CapitaisPaisesRepository {
    // hash com nossos dados para o quiz
    private val capitaisPaises = hashMapOf(
        "Brasil" to "Brasilia",
        "Italia" to "Roma",
        "Franca" to "Paris",
        "Espanha" to "Madrid",
        "Alemanha" to "Berlim",
        "China" to "Pequim",
        "Portugal" to "Lisboa",
        "Russia" to "Moscou",
        "Suica" to "Berna",
        "Austria" to "Viena",
        "Egito" to "Cairo"
    )

    //getter p/ capital que também checa nulidade
    fun getCapitalByPais(pais: String): String? {
        for ((paisGabarito, respostaGabarito) in capitaisPaises) {
            if (pais.trim().equals(paisGabarito, ignoreCase = true)) {
                return respostaGabarito
            }
        }
        return null
    }

    //getter p/ tamanho do quiz
    fun getTotalPerguntas(): Int = capitaisPaises.size

    // getter p/ hash de dados
    fun getCapitaisPaises(): HashMap<String, String> = capitaisPaises
}