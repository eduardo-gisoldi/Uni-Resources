package ex4.br.uscs

open class QuizLogica {

    // implementando dados como HashMap para maior facilidade
    private val capitaisPaises = CapitaisPaisesRepository()

    private var score: Int = 0 // variavel que armazena pontuação do usuário


    // verificar se o par inserido é correto, errado ou país não existente
    fun verificarResposta(pais: String, resposta: String) {
        // verificando existencia do pais nos dados
        if (capitaisPaises.getCapitalByPais(pais) == null) {
            println("Pais não encontrado")
            return
        }

        // loop percorrendo dados em busca da resposta inserida
        for ((paisGabarito, respostaGabarito) in capitaisPaises.getCapitaisPaises()) {
            if (pais.trim().equals(paisGabarito, ignoreCase = true)) {
                if (resposta.trim().equals(respostaGabarito, ignoreCase = true)) {
                    println("Correto!")
                    score++
                    return //finaliza função caso esteja correto
                }
            }
        }

        println("Errado! A resposta correta é: ${capitaisPaises.getCapitalByPais(pais)}")
    }

    //getter p/ score
    fun getScore(): Int = this.score
}