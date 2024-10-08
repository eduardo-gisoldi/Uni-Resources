#include <stdio.h>

//  Luis Eduardo l Gisoldi - Exercício 3:
//    Faça uma função que calcule o n-ésimo termo da série de Fibonacci.

// função para calculo de fibonacci
int fibonacci(int n) {
  // casos de parada
  if (n == 0) return 0;
  if (n == 1) return 1;

  // calculo recursivo
  return fibonacci(n - 1) + fibonacci(n - 2);
}


//  Luis Eduardo l Gisoldi - Exercício 5:
//    Faça um programa em C que solicita dois números inteiros do usuário, calcula a soma desses números e exibe o resultado. O programa deve chamar uma função para calcular a soma de dois números inteiros e retornar este valor.

// função simples que retorna a soma de 2 inteiros
int soma(int a, int b) {
  return a + b;
}


//  Luis Eduardo l Gisoldi - Exercício 6:
//    Faça um programa em C que solicita dois números inteiros do usuário, exibe o valor do maior número. O programa deve chamar uma função para verificar qual é o maior número e retornar este valor.

// função simples que retorna o maior de 2 inteiros
int maior(int a, int b) {
  return (a > b) ? a : b;
}


//  Luis Eduardo l Gisoldi - Exercício 7:
//    Faça um programa em C que solicita três números inteiros do usuário, armazenar em um vetor, exibir a soma dos valores do vetor. O programa deve chamar uma função para calcular a soma dos valores e retornar este valor.

// função que retorna maior numero de um vetor
int somaVetor(int v[], int tamanho) {
  int soma = 0;
  for (int i = 0; i < tamanho; i++) {
    soma += v[i];
  }
  return soma;
}


int main() {

  // execução e teste do ex 3
  int n;
  printf("\n\nDigite o valor de n: ");
  scanf("%d", &n);

  printf("O %d-esimo termo da serie de Fibonacci eh: %d\n", n, fibonacci(n));
  

  // execução e teste do ex 5
  int a, b;
  printf("\n\nDigite o valor do primeiro numero: ");
  scanf("%d", &a);
  printf("Digite o valor do segundo numero: ");
  scanf("%d", &b);

  printf("A soma dos numeros eh: %d\n", soma(a, b));


  // execução e teste do ex 6
  int c, d;
  printf("\n\nDigite o valor do primeiro numero: ");
  scanf("%d", &c);
  printf("Digite o valor do segundo numero: ");
  scanf("%d", &d);

  printf("O maior numero eh: %d\n", maior(c, d));
  

  // execução e teste do ex 7
  int v[3];
  
  printf("\n\nDigite o valor do primeiro numero: ");
  scanf("%d", &v[0]);
  printf("Digite o valor do segundo numero: ");
  scanf("%d", &v[1]);
  printf("Digite o valor do terceiro numero: ");
  scanf("%d", &v[2]);

  printf("A soma dos valores do vetor eh: %d\n", somaVetor(v, 3));


  return 0;
}
