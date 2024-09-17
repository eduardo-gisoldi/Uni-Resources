#include <stdio.h>
#include <stdlib.h>

//Estrutura da lista ligada
typedef struct {
    int* pv;        // vetor com elementos
    int tam;        //qtd elementos validos da lista
    int capacidade; //capacidade da lista
} lista;

//Cria uma nova lista com tamanho igual a "num_elementos"
lista cria_lista(int num_elementos){
    lista l;
    l.capacidade = num_elementos;
    l.pv = (int*) malloc (l.capacidade * sizeof(int));
    l.tam = 0;
    return l;
}

//Exibe a lista
void exibe (lista* l){
    for (int i = 0; i < l->tam; i++){
      printf("%i ", l->pv[i]);
    }
    printf("\n");
}

//Adiciona um elemento na lista
void adiciona (lista* l, int elemento){
    
    int* temp = NULL;
    if (l->tam == l->capacidade){ //estourando a capacidade da lista
      l->capacidade++; //aumentar capacidade
      temp = (int*) malloc(l->capacidade * sizeof(int)); //criar vetor temp com capacidade maior
      for (int i = 0; i < (*l).tam; i++){ //copiar vetor antigo para uma nova area de memoria em temp
        temp[i] = l->pv[i];
      }
      free(l->pv); //liberar memoria do vetor antigo
      l->pv = temp; //atualizar vetor da lista l para apontar para o novo vetor que temp aponta
      temp = NULL; //liberar memoria do vetor temporario
    }
    
    l->pv[l->tam] = elemento; //atualizar elemento no fim da lista
    l->tam++; //aumentar tamanho
}

//Remove o elemento dado como parametro
void remove_elemento (lista* l, int elemento){
  int pos = -1;  //indicador de posição começa com um valor menor que começo (0)
  for (int i = 0; i < l->tam; i++){  //passar pela lista e encontrar o elemento na posição
    if (l->pv[i] == elemento){
      pos = i;
    }
  }
    
  if (pos >= 0){ //certificar que o elemento esteja na lista
    for (int i = pos; i < l->tam; i++){  //a partir da posição que será removida, deslocar o vetor "para trás" uma posição 
      l->pv[i] = l->pv[i+1];
    }
    l->tam--;
  }
  

}


//Teste a sua lista
int main()
{
    lista l = cria_lista(4);

    adiciona (&l, 12);
    adiciona (&l, 5);
    adiciona (&l, 8);
    adiciona (&l, 10);
    adiciona (&l, 15);
    exibe (&l);

    remove_elemento (&l, 5);
    exibe (&l);
}