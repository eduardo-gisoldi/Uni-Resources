//programa deve receber tr�s notas do tipo inteiro, 
//imprimir a m�dia das notas e qual a maior nota
#include <stdio.h>
int main(){
	int n1, n2, n3;
	float media;
	
	printf("Digite tr�s notas: ");
	scanf("%d %d %d", &n1, &n2, &n3);
	
	media = (n1+n2+n3)/3.0;
	printf("M�dia = %.1f\n", media);
	
	if(n1>n2)
		if(n1>n3)
			printf("N1 maior = %d", n1);
		else
			printf("N3 maior = %d", n3);
	else if(n2>n3)
		printf("N2 maior = %d", n2);
	else
		printf("N3 maior = %d", n3);
		
	return 0;
}

