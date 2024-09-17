//programa deve receber trÊs notas do tipo inteiro, 
//imprimir a média das notas e qual a maior nota
#include <stdio.h>
int main(){
	int n1, n2, n3;
	float media;
	
	printf("Digite trÊs notas: ");
	scanf("%d %d %d", &n1, &n2, &n3);
	
	media = (n1+n2+n3)/3.0;
	printf("Média = %.1f\n", media);
	
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

