//package br.uscs;

import java.util.Scanner;

public class Quiz_Capitais_1Sol {
  public static void main(String[] args) {
    
    String[] [] capitais_Paises = {
      { "Itália", "Roma" },
      { "França", "Paris" },
      { "Espanha", "Madrid" },
      { "Alemanha", "Berlim" },
      { "China", "Pequim" },
      { "Portugal", "Lisboa" },
      { "Rússia", "Moscou" },
      { "Suiça", "Berna"},
      { "Austria", "Viena"},
      { "Egito", "Cairo" }
    };
    
    int score = 0;
    
    Scanner scanner = new Scanner(System.in); //entrada de dados

    for (int i = 0; i < capitais_Paises.length; i++) {
        System.out.println("Qual é a capital do país " + capitais_Paises[i][0] + "?");
        String resposta_Usuario = scanner.nextLine();
      if (resposta_Usuario.trim().equalsIgnoreCase (capitais_Paises[i][1])) {
        System.out.println("Correto!");
        score++;
      } else {
        System.out.println("Errado! A resposta correta é: " + capitais_Paises [i][1]);
      }
    }
    scanner.close();

    System.out.println("\no quiz terminou. Você acertou " + score + " de " + capitais_Paises.length + " perguntas.");
    System.out.println("Sua nota é: " + (score * 10 / capitais_Paises.length));

    if (score < 6) System.out.println("Baixo Desempenho");
    else if (score <= 8) System.out.println("Bom Desempenho");
    else System.out.println("Ótimo Desempenho");

  }
}