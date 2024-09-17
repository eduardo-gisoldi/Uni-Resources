#include <stdio.h>
#include <stdlib.h>

typedef struct 
{
  int v[10];  //espaço alocado p/ 10 elementos, n tem como mudar.
} lista_estatica;

typedef struct
{
  int* enderecoIni;  //flexibilidade pra trabalhar com a lista.
  int tamanhoAtual;
  int tamanhoMax;

} lista_dinamica;
 
lista_dinamica CriaLista(int num_elementos){
    lista_dinamica lista;
    lista.tamanhoMax = num_elementos;
    lista.enderecoIni = (int*) malloc(lista.tamanhoMax * sizeof(int));
    lista.tamanhoAtual = 0;
    return lista;
  }
  
    

int main(void) {

  int t = 4;

  lista_dinamica lista;

  printf("test");

  return 0;
}