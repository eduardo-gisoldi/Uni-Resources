fun main() {
  println(" --- --- Inicio do Programa --- --- ")
  
  val array = IntArray(10)
  println("Entre com ${array.size} valores numéricos inteiros: ")
  
  for (i in 0 until array.size) {
    print("Digite o valor número ${i+1}: ")
    array[i] = readLine()?.toIntOrNull() ?: 0 // Usamos o operador elvis para tratar valores nulos como 0
  }

  println("--Elementos armazenados no array: ${array.contentToString()}")

  println(" \n --- --- --- \n" )
  print("Entre com o valor a ser consultado no array: ")
  val valor = readLine()?.toIntOrNull() ?: return
  
  //ex 1 
  var encontrado = false
  for (elem in array) if (elem == valor) encontrado = true

  if (encontrado) println("\nValor $valor existente no array!")
  else println("Valor $valor NÃO existente no array!")

  println("\n --- --- Fim da parte 1 do Programa --- --- \n\n")
  
  //ex 2

  var total = 0
  var aprovados = 0
  for (nota in array) total += nota
  var media = total.toDouble() / (array.size).toDouble()
  println("Media da sala = $media")

  for (nota in array) if (nota > media) aprovados++
  println("A sala teve $aprovados alunos aprovados")

  println("\n --- --- Fim da parte 2 do Programa --- --- \n\n")

  //ex 3
  val Q = IntArray(10)

  for (i in Q.indices) {
    Q[i] = -1
    while (Q[i] < 0) {
      println ("Insira um numero positivo para a posição ${i+1}")
      Q[i] = readLine()?.toIntOrNull() ?: -1
    }
  }
  println("Maior numero: ${Q.maxOrNull()!!}. Posicao do maior num: ${Q.indexOf(Q.maxOrNull()!!) + 1}")

  println("\n --- --- Fim da parte 3 do Programa --- --- \n\n")

  //ex 4
  println("Menor numero: ${Q.minOrNull()!!}. Posicao do menor num: ${Q.indexOf(Q.minOrNull()!!) + 1}")
  
  println("\n --- --- Fim da parte 4 do Programa --- --- \n\n")
  
  //ex 5
  val A = IntArray(10)
  
  for (i in 0 until A.size) {
    print("Digite o valor número ${i+1}: ")
    A[i] = readLine()?.toIntOrNull() ?: 0
  }

  print("Digite o valor a multiplicar o array: ")
  var X = readLine()?.toIntOrNull() ?: 0
  
  val M = A.map{it * X}
  
  println(M)
  
  println("\n --- --- Fim da parte 5 do Programa --- --- \n\n")

  //ex 6

  val B = IntArray(10)
  
  for (i in 0 until B.size) {
    print("Digite o valor número ${i+1}: ")
    B[i] = readLine()?.toIntOrNull() ?: 0
  }
  
  val reversedB = B.reversedArray()

  println("${reversedB.contentToString()}")

  println("\n --- --- Fim da parte 6 do Programa --- --- \n\n")
}