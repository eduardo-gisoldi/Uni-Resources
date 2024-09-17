//programa deve receber duas notas do tipo inteiro, 
//imprimir a média das notas e qual a maior nota
#include <stdio.h>
int main(){
	int n1, n2;
	float media;
	
	printf("Digite duas notas: ");
	scanf("%d %d", &n1, &n2);
	
	media = (n1+n2)/2.0;
	printf("Média = %.1f\n", media);
	
	if(n1==n2)
		printf("Notas iguais\n");
	else if(n1>n2)
		printf("N1 maior = %d", n1);
	else
		printf("N2 maior = %d", n2);
		
	return 0;
}

