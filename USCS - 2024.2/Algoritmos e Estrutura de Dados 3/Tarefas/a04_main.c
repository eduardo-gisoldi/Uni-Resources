#include <stdio.h>
#include <stdlib.h>
#include "pilha.h"
#include "pilha.c"


/* Exercicio1: 
   Dada uma pilha com quatro elementos, escreva um
   c�digo em C que consiga inverter essa pilha.
*/

int main(int argc, char *argv[]) {

	Pilha* p = cria_pilha();
	empilha (p, 7);
	empilha (p,12);
	empilha (p, 21);
	empilha (p, 11);
	exibe (p);
	
	inverte (p);
	
	exibe (p);

}
