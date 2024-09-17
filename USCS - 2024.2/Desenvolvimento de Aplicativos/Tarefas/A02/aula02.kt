fun main () {
  /*/exemplo declaração 1
  var a: Int
  a = 99
  println(a)

  //exemplo declaração 2
  var b: Int = 33
  println(b)

  //exemplo declaração 3
  var c = 55
  println(c)
  
  //exemplo declaração com val
  val d = 55
  //d = 1  ---> error: val cannot be reassigned
  println(d)
  */


  var x = 4
  var a = 15
  var b = 2
  var y = 8

  x = a % b
  while (x != 0) {
    y++
    b = y + x
    a--

    x = a % b
  }
  
  println("y = $y")
}