//package br.uscs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class t2_02 {
  public static void main(String[] args) {
    
    /* String[] [] capitais_paises = {
      { "Brasil", "Brasilia" },
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
    }; */
    
    HashMap<String, String> capitais_paises = new HashMap<>();
    capitais_paises.put("Brasil", "Brasilia");
    capitais_paises.put("Italia", "Roma");
    capitais_paises.put("Franca", "Paris");
    capitais_paises.put("Espanha", "Madrid");
    capitais_paises.put("Alemanha", "Berlim");
    capitais_paises.put("China", "Pequim");
    capitais_paises.put("Portugal", "Lisboa");
    capitais_paises.put("Russia", "Moscou");
    capitais_paises.put("Suica", "Berna");
    capitais_paises.put("Austria", "Viena");
    capitais_paises.put("Egito", "Cairo");
    
    int score = 0;
    
    Scanner scanner = new Scanner(System.in); //entrada de dados



    Iterator<Map.Entry<String, String>> it = capitais_paises.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<String, String> atual = it.next();

      System.out.println("Qual é a capital do país " + atual.getKey() + "?");
    
      String resposta_Usuario = scanner.nextLine();
      if (resposta_Usuario.trim().equalsIgnoreCase (atual.getValue())) {
        System.out.println("Correto!");
        score++;
      } else {
        System.out.println("Errado! A resposta correta é: " + atual.getValue());
      }
    }

    scanner.close();

    System.out.println("\no quiz terminou. Você acertou " + score + " de " + capitais_paises.size() + " perguntas.");
    System.out.println("Sua nota é: " + (score * 10 / capitais_paises.size()));

    if (score < 6) System.out.println("Baixo Desempenho");
    else if (score <= 8) System.out.println("Bom Desempenho");
    else System.out.println("Ótimo Desempenho");

  }
}