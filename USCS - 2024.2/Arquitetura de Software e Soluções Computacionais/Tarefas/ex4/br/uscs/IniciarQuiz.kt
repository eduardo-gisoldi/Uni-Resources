package ex4.br.uscs

class IniciarQuiz {
    //metodo para execução rápida do quiz
    fun executarQuiz() {
        val quizLogica = QuizLogica()
        val quizDados = CapitaisPaisesRepository()
        val quizInterface = QuizInterfaceUsuario(quizLogica, quizDados)

        quizInterface.executarQuiz()
    }
}