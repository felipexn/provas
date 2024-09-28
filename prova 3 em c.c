//luiz felipe souza vasconcelos
#include <stdio.h>
#include <string.h>
#include <stdlib.h>


#define max_gastos 6
#define max_meses 12

int main (){
	int maxg;
	int maxm;
	
	printf("digite o numero de gastos'maximo 6': ");
	scanf("%i",&maxg);
	
	if(maxg > max_gastos)
	printf("numero de gastos invalido");
	fflush(stdin);
	
	printf("digite o numero de meses'maximo 12': ");
	scanf("%i",&maxm);
	if(maxm> max_meses)
	printf("numero de meses invalido");
	fflush(stdin);
	
	char meses[][4] = {"JAN", "FEV","MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};
	char* nomegastos[maxg][30];
	int i, j;
	
	for(i = 0; i < maxg; i++){
		printf("digite o nome do gasto %d\n",i+1);
	    scanf("%s",nomegastos[i]);}
	fflush(stdin);
	
	float valor[100][100];
	
	for(i = 0; i < maxg; i++){
	   for(j = 0; j < maxm; j++){
	   printf("gasto com %s no mes de %s\n",nomegastos[i],meses[j]);
	   fflush(stdin);
	   scanf("%f",&valor[i][j]);}
}
	printf("\n");
  	for(i = 0; i < maxg; i++){
	   for(j = 0; j < maxm; j++)
    printf("%s: R$%.2f\n",nomegastos[i],valor[i][j]);}
    
    printf("\n");
    float mediagastos[100];
    int soma;
    for(i = 0; i < maxg; i++){
    	soma = 0;
	   for(j = 0; j < maxm; j++){	   
	   soma = soma + valor[i][j];}
	   
	   mediagastos[i] = soma;
	   printf("media gasto em %s :%.2f\n",nomegastos[i],mediagastos[i]/maxm);
	   
}
	printf("\n");
	float mediames[100];
 	for(i = 0; i < maxg; i++){
    	soma = 0;
	   for(j = 0; j < maxm; j++){	   
	   soma = soma + valor[j][i];}
	   mediames[j]= soma;
	   printf("valor gasto no mes de %s e: %.2f\n",meses[i],mediames[j]);
}
	   float total;
	   for(i = 0; i < maxg; i++){
	   	for(j = 0; j < maxm; j++)
	   	total += valor[i][j];}
	   	printf("\nsoma total: %.2f",total);
	  

    
	
	return 0;
}

