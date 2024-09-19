//ex 1
open class DadosQuiz {
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