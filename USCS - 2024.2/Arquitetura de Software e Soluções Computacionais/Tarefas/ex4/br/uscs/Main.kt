package ex4.br.uscs

fun main() {
    val quizExec = IniciarQuiz()
    quizExec.executarQuiz()
}

private fun avaliarDesempenho(desempenho: Int) {
    when {
        desempenho < 6 -> println("Baixo Desempenho")
        desempenho <= 8 -> println("Bom Desempenho")
        else -> println("Ótimo Desempenho")
    }
}