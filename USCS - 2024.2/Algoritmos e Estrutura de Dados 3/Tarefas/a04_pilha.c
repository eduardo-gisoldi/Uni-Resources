#include <stdlib.h>
#include <stdio.h>
#include "pilha.h"

//Cria uma pilha vazia
Pilha* cria_pilha(){
	Pilha* tmp = (Pilha*) malloc (sizeof(Pilha));
	
	tmp->topo = NULL;
	tmp->tam = 0;
	
	return tmp;
}

//Exibe os elementos da pilha do topo at� o final
// da pilha
void exibe (Pilha* p){
	Elemento* tmp = p->topo;
	
	while (tmp != NULL){
		printf("%i ", tmp->valor);
		tmp = tmp->prox;
	}
	printf("\n");
	
	return;
}

//Devolve 1 se a pilha � vazia e 0, caso contr�rio
int Pilha_vazia (Pilha* p){
	return (p->topo == NULL);
}

//Insere um elemento no topo da pilha
void empilha (Pilha* p, int n){
	Elemento* novo = (Elemento*) malloc (sizeof(Elemento));
	novo->prox = NULL;
	novo->valor = n;
	
	novo->prox = p->topo;
	p->topo = novo;
	p->tam = p->tam + 1;
	
	return;
}

//Remove o elemento do topo da pilha
Elemento* desempilha (Pilha* p){
	Elemento* tmp = p->topo;
	
	if (tmp != NULL){
		p->topo = tmp->prox;
		tmp->prox = NULL;
		p->tam = p->tam - 1;
	}
	
	return tmp;
}

//Devolve o elemento que est� no topo da pilha
Elemento* topo (Pilha* p){
	return p->topo;
}

//Inverte os elementos da pilha
void inverte (Pilha* p){
	Pilha* tmp = cria_pilha();

  Elemento* tmpEL;

  while (!Pilha_vazia(p)) {
    tmpEL = desempilha(p);
    empilha(tmp, tmpEL->valor);
  }
  
  p->topo = tmp->topo;
  p->tam = tmp->tam;
  tmp->topo = NULL;
}
