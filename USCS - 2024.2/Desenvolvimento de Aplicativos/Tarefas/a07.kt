class ContaBancaria {
  private var saldoInicial: Double
  private var taxaJuros: Double
  private val depositosMensais = mapOf(
    1 to 200.0,
    2 to 150.0,
    3 to 300.0,
    4 to 100.0,
    5 to 250.0,
    6 to 200.0
  )

  constructor(saldoInicial: Double, taxaJuros: Double) {
    this.saldoInicial = saldoInicial
    this.taxaJuros = taxaJuros
  }

  fun calcularSaldoFinal(): Double {7
    var saldoFinal = saldoInicial
    for ((mes, deposito) in depositosMensais) {
      saldoFinal += deposito
      saldoFinal += saldoFinal * (taxaJuros/100)
    }
    return saldoFinal
  }
}