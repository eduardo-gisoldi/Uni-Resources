#include <stdio.h>
#include <stdlib.h>

//Estrutura da lista ligada
typedef struct {
    int* pv;
    int tam;
    int cap;
} lista;

//Cria uma nova lista com tamanho igual a "num_elementos"
lista cria_lista(int num_elementos){
    lista l;
    l.cap = num_elementos;
    l.tam = 0;
    l.pv = (int*) malloc (l.cap * sizeof(int));
    return l;
}

//Exibe a lista
void exibe (lista l){
    //coloque o codigo aqui.
}

//Adiciona um elemento na lista
void adiciona (lista l, int elemento){
    
    l.tam++;
}

//Remove o elemento dado como parametro
void remove (lista l, int elemento){
    l.tam--;
}


//Teste a sua lista
int main()
{
    lista l = cria_lista(4);

    adiciona (l, 12);
    adiciona (l, 5);
    adiciona (l, 8);
    adiciona (l, 10);
    //adiciona (l, 15);
    remove (l, 5);
    
    exibe (l);
}
