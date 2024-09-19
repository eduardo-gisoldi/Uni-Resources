/*
import br.uscs.DadosQuiz
import br.uscs.LogicaQuiz
import br.uscs.QuizCapitais_1
*/


import java.util.*

//ex 1
class DadosQuiz {
  val capitaisPaises = hashMapOf(
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

  fun getDadosQuiz(): HashMap<String, String> {
    return capitaisPaises
  }
}

//ex 2
class LogicaQuiz {
  private val dados = DadosQuiz()
  private var score = 0


  //ex 4
  private fun verificarResposta(respostaUsuario: String, gabarito: String) {
    if (respostaUsuario.trim().equals(gabarito, ignoreCase = true)) {
      println("Correto!")
      score++
    } else {
      println("Errado! A resposta correta é: $gabarito")
    }
  }

  //ex 6
  private fun avaliarDesempenho(desempenho: Int) {
    when {
      desempenho < 6 -> println("Baixo Desempenho")
      desempenho <= 8 -> println("Bom Desempenho")
      else -> println("Ótimo Desempenho")
    }    
  }

  //ex 5
  private fun finalizarQuiz(pontuacao: Int, total: Int) {
    println("\nO quiz terminou. Você acertou $pontuacao de $total perguntas.")
    println("Sua nota é: ${pontuacao * 10 / total}")

    avaliarDesempenho(pontuacao)
  }

  //ex 3
  fun processarQuiz() {
    val capitaisPaises = dados.getDadosQuiz()
    val scanner = Scanner(System.`in`)

    for ((pais, capital) in capitaisPaises) {
      println("Qual é a capital do país $pais?")
      val respostaInput = scanner.nextLine()

      verificarResposta(respostaInput, capital)
    }
    scanner.close()

    finalizarQuiz(score, capitaisPaises.size)
  }
}


class QuizCapitais_1 {
  fun run() {
    val quiz = LogicaQuiz()
    quiz.processarQuiz()
  }
}



fun main() {
  val quiz = QuizCapitais_1()
  quiz.run()
}
