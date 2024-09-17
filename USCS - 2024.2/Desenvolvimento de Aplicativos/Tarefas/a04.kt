fun main() {
  /*
  val lista = arrayOf(1,2,3,4)
  var r = 1;

  for (n in lista) {
    if(n % 2 != 0) {
      continue
    }
    r += n
  }

  for (i in 1..r step 2) {
    if(i % 4 == 0) {
      continue
    }
    r += i
  }

  println(r)
  */

  var r = 0
  var a = readLine()?.toIntOrNull()
  var b = readLine()?.toIntOrNull()

  if (a != null && b != null && a<b) {
    for (i in a..b) {
      if (i%2 == 0) {
        r += (i*2 + a/(i+1) + b/(i+2))
      } else { 
        r += (i + a%(i+1) + b%(i+2))
      }
    }
  }

  println(r)

}