fun main () {
  /*var a = 14
  var b = 5
  var c = 7
  var d = 2

  val a1 = (a / b) * (c % d)
  val a2 = (a - c) / (b * d)
  val a3 = (b * d) - (b + (d % c))
  
  println((a1 * a2) - a3)
  */


  val a: String = "Kotlin"
  val b: String = a
  val c: String = "Kotlin"
  val d: String = "Kot" + "lin"
  val e: String = "a"
  val x: Int = 10
  val y: Int = 10
  val z: Int = x

  val a1 = if(a.equals(c)) 1 else 0;
  val a2 = if(a == c) 1 else 0;
  val a3 = if(x == y) 1 else 0;
  val a4 = if(x == z) 1 else 0;
  val a5 = if(b != d) 1 else 0;
  val a6 = if(a === e && y == z) 1 else 0; //*->entender diferença de referencia e igual
  val a7 = if(d.equals(b)) 1 else 0;
  val a8 = if(a !== e || y != z) 1 else 0;

  val r = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8
  println(r)



  
}