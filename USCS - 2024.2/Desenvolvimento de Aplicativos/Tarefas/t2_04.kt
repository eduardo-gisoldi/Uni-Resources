// EX 1
/*
fun main() {
  println(" --- Início do Programa --- ")
  print("Entre com um valor numérico inteiro: ")
  val N = readLine()?.toIntOrNull()
  
  if (N == null) println("Por favor, entre com um número inteiro válido.")
  else {
    println("Valor N entrado: $N")
    if (N < 10) println("Valor Inválido")
    else for (i in 1..N) println("$i. USCS")
  }
  
  println(" --- Fim de Programa --- ")
}
*/

//EX 2
/* 
fun main() {
  var n = 1;
  while (n <= 20) {
    print("$n ")
    n++;
  }
}
*/

//EX 3
/* 
fun main() {
  var n = 20;
  while (n >= 1) {
    print("$n ")
    n--
  }
}
*/

//EX 4
/* 
fun main() {
  print("Entre com um valor numérico inteiro: ")
  val N = readLine()!!.toInt()
  var i = 0
  
  if (N <= 0) {
    println("Valor Inválido")
    return
  }

  while (i <= N) {
    print("$i ")
    i++
  }
}
*/

//EX 5
/* 
fun main() {
  print("Entre com um valor numérico inteiro: ")
  val N = readLine()!!.toInt()
  var i = 0
  
  if (N <= 0) {
    println("Valor Inválido")
    return
  }
  
  while (i <= N) {
    print("USCS ")
    i++
  }
}
*/

//EX 6
/*
fun main() {
  for (i in 1..10) print("$i ")
}
*/

//EX 7
/* 
fun main() {
  for (i in 20 downTo 1) print("$i ")
}
*/

//EX 8
/* 
fun main() {
  print("Entre com um valor numérico inteiro: ")
  val N = readLine()!!.toInt()
  var i = 0
  
  if (N <= 0) {
    println("Valor Inválido")
    return
  }
  
  for (i in 1..10) print("$i ")
}
*/

//EX 9
/* 
fun main() {
  var valores = mutableListOf<Int>()
  
  for (i in 1..10) {
    println("Insira o valor ${i}: ")
    valores.add(readLine()!!.toInt())
  }
  
  println("Soma dos valores: ${valores.sum()}")
}
*/


//EX 10
/* */
fun main() {
  var valores = mutableListOf<Int>()
  
  for (i in 1..10) {
    println("Insira o valor ${i}: ")
    valores.add(readLine()!!.toInt())
  }

  var soma = 0
  for (valor in valores) if (valor % 2 == 0) soma += valor
  
  println("Soma dos valores pares: $soma")
}