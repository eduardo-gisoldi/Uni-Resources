fun main() {
  // EX 1
  println("---Início do Programa 1 ---")
  print("Entre com um valor numérico inteiro: ")
  val valor = readLine()?.toIntOrNull()
  
  if (valor != null) {
    println("Valor entrado: $valor")

    if (valor > 10) println("Valor entrado maior que 10!")
    else println("Valor entrado não é maior que 10!")
    
  } else {
    println("Entrada inválida. Por favor, digite um número inteiro.")
  }
  
  println("---Fim do programa 1 ---")
  println("Pressione enter para sair...")
  
  readLine()


  // EX 2
  println("---Início do Programa 2 ---")
  print("Entre com um valor numérico inteiro: ")

  var parOuImpar = readLine()!!.toInt()
  if (parOuImpar % 2 == 0) println("O elemento informado é par")
  else println("O elemento informado é impar")

  println("---Fim do programa 2 ---")
  println("Pressione enter para sair...")
  
  readLine()


  // EX 3
  println("---Início do Programa 3 ---")
  var notas = arrayOf(0.0, 0.0, 0.0)
  var totalNotas = 0.0
  for (i in notas.indices) {
    println("Entre com a nota ${i+1}: (use formato double)")
    notas[i] = readLine()!!.toDouble()
    totalNotas += notas[i]
  }
  var media = totalNotas / 3.0
  if (media >= 6.0) println("Aprovado")
  else println("Reprovado")

  println("---Fim do programa 3 ---")
  println("Pressione enter para sair...")
  
  readLine()
  
  
  // EX 4
  println("---Início do Programa 4 ---")

  var notas2 = arrayOf(0.0, 0.0, 0.0)
  var pesos = arrayOf(2.0, 3.0, 4.0)
  var totalNotasPond = 0.0
  var totalPesos = 0.0

  for (i in notas.indices) {
    println("Entre com a nota ${i+1}: (use formato double)")
    notas2[i] = readLine()!!.toDouble()
  
    totalNotasPond += notas2[i] * pesos[i]
    totalPesos += pesos[i]

    println("Nota ${i+1} entrada: ${notas2[i]}. Essa prova tem peso ${pesos[i]}")
  }
  
  var media2 = totalNotasPond / totalPesos
  if (media2 >= 5.0) println("Aprovado")
  else println("Reprovado")
  
  println("---Fim do programa 4 ---")
  println("Pressione enter para sair...")
  
  readLine()
    
  
  // EX 5
  println("---Início do Programa 5 ---")

  println("Entre com o valor do preco: (use formato double)")
  var preco = readLine()!!.toDouble()
  println("Entre com o valor da quantidade: (use formato inteiro)")
  var qnt = readLine()!!.toInt()
  var desconto = 0.1
  
  var totalCompra = preco * qnt.toDouble()

  if (qnt >= 10) totalCompra = totalCompra - (totalCompra * desconto)

  println("O pedido de $qnt elementos do produto com preço $preco tem valor total da compra: $totalCompra")

  println("---Fim do programa 5 ---")
  println("Pressione enter para sair...")
  
  readLine()
    
  
  // EX 6
  println("---Início do Programa 6 ---")

  println("Entre com o valor 1 inteiro: ")
  var n1 = readLine()!!.toInt()
  println("Entre com o valor 2 inteiro: ")
  var n2 = readLine()!!.toInt()

  if (n1 == n2) println("Valores entrados são iguais")
  else println("Valores entrados são diferentes")

  println("---Fim do programa 6 ---")
  println("Pressione enter para sair...")
  
  readLine()
    
  
  // EX 7
  println("---Início do Programa 7 ---")

  println("Entre com o valor 1 inteiro: ")
  var n3 = readLine()!!.toInt()
  println("Entre com o valor 2 inteiro: ")
  var n4 = readLine()!!.toInt()

  if (n3 == n4) println("Valores entrados são iguais")
  else if (n3 > n4) println("O maior é $n3")
  else println("O maior é $n4")

  println("---Fim do programa 7 ---")
  println("Pressione enter para sair...")
  
  readLine()
    
  
  // EX 8
  println("---Início do Programa 8 ---")

  println("Insira sua idade: (use valor inteiro)")
  var idade = readLine()!!.toInt()

  if (idade >= 18 && idade <= 67) println("Voce pode doar sangue")
  else println("Voce não pode doar sangue")

  println("---Fim do programa 8 ---")
  println("Pressione enter para sair...")
  
  readLine()
}