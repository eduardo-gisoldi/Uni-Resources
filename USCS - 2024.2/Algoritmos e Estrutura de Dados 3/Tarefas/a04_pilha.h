#include <stdio.h>
/*
int x = 1;
int* pX = &x; // 1321111

pX // 1321111
*pX // 1


Pilha x
topo([10] ->) [7] -> [5] ->
tam 3

*/



//Definicao do elemento da Pilha
struct No{
	int valor;
	struct No* prox;
};
typedef struct No Elemento;

//Definicao da Pilha
struct P {
	Elemento* topo;
	int tam;
};
typedef struct P Pilha;

//Cria uma pilha vazia
Pilha* cria_pilha();

//Exibe os elementos da pilha do topo at� o final
// da pilha
void exibe (Pilha*);

//Devolve 1 se a pilha � vazia e 0, caso contr�rio
int Pilha_vazia (Pilha*);

//Insere um elemento no topo da pilha
void empilha (Pilha*, int);

//Remove o elemento do topo da pilha
Elemento* desempilha (Pilha*);

//Devolve o elemento que est� no topo da pilha
Elemento* topo (Pilha*);

//Inverte os elementos da pilha
void inverte (Pilha*);

