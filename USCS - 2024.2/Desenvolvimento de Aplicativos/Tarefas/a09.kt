open class Colaborador (val nome: String, val horasTrabalhadas: Int, val valorPorHora: Double) {
  open fun calcularSalario(): Double {
    return horasTrabalhadas * valorPorHora
  }
}

class Gerente (nome: String, horasTrabalhadas: Int, valorPorHora: Double, val bonus: Double) : Colaborador (nome, horasTrabalhadas, valorPorHora) {
  override fun calcularSalario(): Double {
    return super.calcularSalario() + bonus
  }
}

fun main() {
  val funcionarios: Array<Colaborador> = arrayOf(
    Colaborador ("Carlos", 160, 25.0),
    Gerente ("Ana", 180, 30.0, 1000.0),
    Colaborador ("João", 170, 22.0),
    Gerente ("Maria", 150, 35.0, 1500.0)
  )

  var totalSalarios = 0.0
  for (funcionario in funcionarios) totalSalarios += funcionario.calcularSalario()

  println("\nTotal da folha de pagamento: R$$totalSalarios")
}