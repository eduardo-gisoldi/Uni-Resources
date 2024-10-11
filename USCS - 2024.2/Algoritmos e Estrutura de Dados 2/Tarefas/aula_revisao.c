#include <stdio.h>

//Exemplo 2: Uma função que verifica se um número é par ou ímpar. (versão com impressao em main)
char verificaParidade(int n) {
  return (n % 2 == 0) ? 'p' : 'i';
}


int main() {
  int numero;
  printf("Digite um numero inteiro: ");
  scanf("%d", &numero);
  if (verificaParidade(numero) == 'p') printf("eh par");
    else printf("eh impar");
  return 0;
}