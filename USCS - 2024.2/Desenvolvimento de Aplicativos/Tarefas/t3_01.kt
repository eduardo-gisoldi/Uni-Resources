import kotlin.math.pow

//printar separação de exercícios
fun fimDaParte(parte: Int) {
  println("\n --- --- Fim da parte $parte do Programa --- --- \n\n")
}

//função do ex01
fun saudacao (nome: String?, idade: Int) : String {
  var nao = "" //variavel para inserir no return caso idade <18 ou >65
  if (idade < 18 || idade > 65) nao = " não"

  return "Olá, $nome! Você tem $idade anos!\nVocê$nao pode doar sangue!"
}

//função do ex02
fun sayHello() = println("Hello, World!")

//função do ex03
fun soma2Numeros(n1: Int, n2: Int) = (n1 + n2)

//função do ex04
fun verificaParidade(n: Int) = n % 2 == 0

//função do ex05
fun concatenaStrings(s1: String?, s2: String?) = "$s1$s2"

//função do ex06
fun IMC(peso: Int, altura: Double) = peso.toDouble() / (altura.pow(2))

//função do ex07
fun verificaMaioridade(idade: Int) = (idade >= 18)

//função do ex08
fun listaQuadrados(n: Int) {
  for (i in 1..n) println(i.toDouble().pow(2).toInt())
}

//função do ex09
fun fibonacci(n: Int): Int {
  if (n <= 1) return n
  return fibonacci(n-1) + fibonacci(n-2)
}

//função do ex10
fun fatorial(n: Int): Int {
  if (n <= 1) return 1
  else return n * fatorial(n - 1)
}


//função main para testes
fun main() {
  println(" --- --- Inicio do Programa --- --- ")
  //teste da parte 1
  println("Entre com o seu nome: ")
  val nome: String? = readlnOrNull()

  println("Entre com sua idade: ")
  val idade: Int = readln().toInt()

  val retorno = saudacao (nome, idade)
  println (retorno)

  fimDaParte(1)

  //teste da parte 2
  sayHello()

  fimDaParte(2)

  //teste da parte 3
  val n1 = 3
  val n2 = 4

  println("A soma de $n1 e $n2 é ${soma2Numeros(n1, n2)}")

  fimDaParte(3)

  //teste da parte 4
  println("A idade inserida no programa 1 é par? : ${verificaParidade(idade)}")

  fimDaParte(4)

  //teste da parte 5
  val str1 = "Essa é a string1."
  val str2 = " E essa é a string2."

  println(concatenaStrings(str1, str2))

  fimDaParte(5)

  //teste da parte 6
  val peso = 80
  val altura = 1.80

  println("O IMC de uma pessoa com ${peso}kgs e ${altura}m é ${IMC(peso, altura)}")

  fimDaParte(6)

  //teste da parte 7
  println("A pessoa registrada no programa 1 é maior de idade? : ${verificaMaioridade(idade)}")

  fimDaParte(7)

  //teste da parte 8
  val numero = 8

  listaQuadrados(numero)

  fimDaParte(8)

  //teste da parte 9
  println("O valor de fibonacci para $numero é ${fibonacci(numero)}")

  fimDaParte(9)

  //teste da parte 10
  println("O valor de fatorial para $numero é ${fatorial(numero)}")

  fimDaParte(10)
}