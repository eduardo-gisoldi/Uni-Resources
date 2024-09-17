fun main() {
  println(" --- --- Inicio do Programa --- --- ")
  
  fun saudacao (nome: String?, idade: Int?) : String {
    return ("Olá, " + nome + " ! " + "Você tem " + idade + " anos!")
  }
  
  val nome: String?
  val idade: Int?

  println("Entre com o seu nome: ")
  nome = readLine()
    
  println("Entre com sua idade: ")
  idade = readLine()?.toIntOrNull()
    
  val retorno = saudacao (nome, idade)
  println (retorno)
}