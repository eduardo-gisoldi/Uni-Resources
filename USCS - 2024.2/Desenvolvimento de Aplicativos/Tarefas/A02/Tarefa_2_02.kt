fun main() {
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