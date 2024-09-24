package ex4.br.uscs
import java.util.*

class QuizInterfaceUsuario (val quiz: QuizLogica, val dados: CapitaisPaisesRepository) {

    // função publica usada para execução geral do quiz
    fun executarQuiz() {

        val scanner = Scanner(System.`in`)

        // loop principal do quiz, leva a verificarResposta para cada input do usuário
        for ((pais, capital) in dados.getCapitaisPaises()) {
            println("Qual é a capital do país $pais?")
            val respostaInput = scanner.nextLine()

            quiz.verificarResposta(pais, respostaInput)
        }
        scanner.close()

        // mostrar log final do quiz com o resultado
        finalizarQuiz(quiz.getScore(), dados.getTotalPerguntas())
    }

    private fun finalizarQuiz(pontuacao: Int, total: Int) {
        println("\nO quiz terminou. Você acertou $pontuacao de $total perguntas.")
        println("Sua nota é: ${pontuacao * 10 / total}")
    }
}