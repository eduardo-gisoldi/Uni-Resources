package br.uscs

import java.util.*

fun main() {
    // Mapa de capitais e países
    val capitaisPaises = hashMapOf(
        "Brasil" to "Brasilia",
        "Italia" to "Roma",
        "Franca" to "Paris",
        "Espanha" to "Madrid",
        "Alemanha" to "Berlim",
        "China" to "Pequim",
        "Portugal" to "Lisboa",
        "Russia" to "Moscou",
        "Suica" to "Berna",
        "Austria" to "Viena",
        "Egito" to "Cairo"
    )

    var score = 0

    val scanner = Scanner(System.`in`) // Entrada de dados

    for ((pais, capital) in capitaisPaises) {
        println("Qual é a capital do país $pais?")
        val respostaUsuario = scanner.nextLine()
        if (respostaUsuario.trim().equals(capital, ignoreCase = true)) {
            println("Correto!")
            score++
        } else {
            println("Errado! A resposta correta é: $capital")
        }
    }

    scanner.close()

    println("\nO quiz terminou. Você acertou $score de ${capitaisPaises.size} perguntas.")
    println("Sua nota é: ${score * 10 / capitaisPaises.size}")

    when {
        score < 6 -> println("Baixo Desempenho")
        score <= 8 -> println("Bom Desempenho")
        else -> println("Ótimo Desempenho")
    }
}
