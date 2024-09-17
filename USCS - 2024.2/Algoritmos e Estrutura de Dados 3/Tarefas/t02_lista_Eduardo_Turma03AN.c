#include <stdio.h>
#include <stdlib.h>

typedef struct {
            int* elementos;
            int capacidade;
            int qtd_elementos;
        } lista;
        
//Cria uma nova lista e inicializa seus atributos.
//  Recebe a capacidade maxima da lista como parametro
lista cria_lista (int cap){
    lista temp;
    
    temp.capacidade = cap;
    temp.qtd_elementos = 0;
    temp.elementos = (int*) malloc (temp.capacidade * sizeof(int));
    
    return temp;
}

//Exibe a lista
void exibe (lista* l){
    for (int i=0; i<l->qtd_elementos; i++){
        printf ("%i ", l->elementos[i]);
    }
    printf ("\n");
}

//Insere elementos na lista
void insere (lista* l, int novo){
    int* tmp;
    
    if (l->qtd_elementos == l->capacidade){
        l->capacidade = l->capacidade*2;
        tmp = (int*) malloc (l->capacidade * sizeof(int));
        for (int i=0; i<l->qtd_elementos; i++){
            tmp[i] = l->elementos[i];
        }
        free (l->elementos);
        l->elementos = tmp;
        tmp = NULL;
    }
    
    l->elementos[l->qtd_elementos] = novo;
    l->qtd_elementos++;
    
}

//Verifica se a lista está vazia. Devolve 1 se a lista está vazia
//  e 0, caso contrario
int lista_vazia (lista* l){
    if (l->qtd_elementos == 0){
        return 1;
    }
    return 0;
}

//Verifica se a lista está cheia. Devolve 1 se a lista está cheia 
//  e 0, caso contrario.
int lista_cheia (lista* l){
    if (l->capacidade == l->qtd_elementos){
        return 1;
    }
    return 0;
}

//Remove o primeiro elemento da lista. Retorna -1 se a lista é vazia.
int remove_primeiro (lista* l){
    if (l->qtd_elementos > 0){
        int res = l->elementos[0];
        for (int i=0; i<l->qtd_elementos-1; i++){
            l->elementos[i] = l->elementos[i+1];
        }
        l->qtd_elementos = l->qtd_elementos - 1;
        return res;
    }
	return -1;
}

//Verifica se o elemento "x" está presente na lista "l". Devolve 1 se "x" está em "l"
//  e devolve 0, caso contrário
int busca (lista* l, int x){
	for (int i=0; i<l->qtd_elementos; i++){
    if (l->elementos[i] == x){
      return 1;
    }
  }
  return 0;
}

//Retorna o último elemento da lista após removê-lo da lista "l". Retorna -1 se a lista é vazia.
int remove_final (lista* l){
	if (lista_vazia(&l) == 1) return -1;
  
  int tmp = l->elementos[l->qtd_elementos];
  l->qtd_elementos--;

  return tmp;
}

//Remove todos os elementos de "l" com valores iguais a "x".
void remove_elemento (lista* l, int x){
	for (int i=0; i<l->qtd_elementos; i++){
    if (l->elementos[i] == x){
      for (int j = i; j<l->qtd_elementos; j++){
        l->elementos[j] = l->elementos[j+1];
      }
      l->qtd_elementos--;
    }
    if (l->elementos[i] == x) i--;
  }
}

//Devolve a quantidade de elementos da lista "l".
int num_elementos (lista* l){
	return l->qtd_elementos;
}


int main (){
    lista l = cria_lista(5);
    
    insere (&l, 12);
    insere (&l, 15);
    insere (&l, 20);
    insere (&l, -4);
    insere (&l, 8);
    insere (&l, 10);
    insere (&l, 21);
    insere (&l, 10);
    insere (&l, 10);
    insere (&l, 99);
    insere (&l, 75);
    insere (&l, 10);
    insere (&l, 29);
    
    exibe(&l);

    remove_final(&l);

    remove_elemento(&l, 10);
    remove_elemento(&l, 182);

    printf ("buscamos 12, resultado: %i, buscamos 1, resultado: %i\n num elementos: %i \n\n", busca(&l, 12), busca(&l, 1), num_elementos(&l));

    exibe(&l);
}
