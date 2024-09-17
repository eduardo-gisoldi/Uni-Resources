/*fun eMsg(m: String, c: Int) {
  var i = 1
  while ( i <= c ) {
    print("$m$i")
    i++
  }
}

fun main() {
  var a = 5
  eMsg("CC", a)
}*/

/*fun q(x:Int) = x * x
fun ehP(x:Int) = if (x % 2 == 0) "a" else "b"
fun f(n:Int): Int = if (n <= 1) n else f(n-1) + f(n-2)

fun main() {
  val n = 8
  println("${q(n)} ${ehP(n)} ${f(n)}")
}*/

fun q(vararg nums:Int):List<Int> {
  val r = mutableListOf<Int>();
  for (num in nums) r.add(num * num)
  return r
}

