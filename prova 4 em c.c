//luiz felipe
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

typedef struct conta{
	int tipo;
	float limite;
	float saldo;
}Conta;

float saca(int , float , float );
float investe(int , float , int );

int main(){
Conta cc;
cc.saldo = 50;
cc.tipo = 0;

Conta cp;
cp.saldo = 50;
cp.tipo = 1;

float sub;
float sub1;
int meses;
float investimento,investimento1, valorsacadop, valorsacado;

printf("deposite um valor na conta corrente: ");
scanf("%f", &cc.saldo);
printf("deposite um valor na conta poupanca: ");
scanf("%f", &cp.saldo);
printf("%.2f %.2f\n",cc.saldo, cp.saldo);
printf("");
scanf("");

printf("digite a quantidade de meses que deseja investir na conta corrente \n");
scanf("%i", &meses);
scanf("");

printf("digite a qunatidade de meses que deseja investir na conta poupanca \n");
scanf("%i",&meses);
scanf("");

printf("quanto deseja sacar na conta corrente? ");
scanf("%f",&valorsacado);
//printf("R$%.2f SACADO\n",saca(cc.tipo,valorsacado,cc.saldo));

printf("quanto deseja sacar na conta poupanca? ");
scanf("%f",&valorsacadop);
//printf("R$%.2f SACADO\n",saca(cp.tipo,valorsacadop,cp.saldo));

sub = saca(cc.tipo,valorsacado,cc.saldo);
printf("saldo final da conta corrente: R$%.2f\n",cc.saldo-sub);

sub1 = saca(cp.tipo,valorsacado,cp.saldo);
printf("saldo final da conta poupanca: R$%.2f\n",cp.saldo-sub1);

investimento = investe(cc.tipo, cc.saldo, meses );
printf("saldo final da conta corrente depois do investimento: R$%.2f\n",cc.saldo+investimento);

investimento1= investe(cp.tipo,cp.saldo, meses);
printf("saldo final da conta poupanca depois do investimento: R$%.2f\n",cp.saldo+investimento1);


return 0;
}
float saca(int type, float valorsacado, float a){
	Conta cc;
	cc.limite = 200;
	
	Conta cp;
	cp.limite = 100;
		
	if (type == 0 && valorsacado <= a && valorsacado <= cc.limite){
			valorsacado += valorsacado*0.02;
	return valorsacado;
	}else if(type == 1 && valorsacado <= a && valorsacado <= cp.limite){
			valorsacado += valorsacado*0.05;
	return valorsacado;
	}else
	return valorsacado ;
}
float investe(int tipo, float saldo, int meses){
scanf("");
	float inve;
	if(tipo == 0){
	inve = saldo*pow((1+0.01),meses);
	return inve;
	}else if(tipo == 1){
	inve = saldo*pow((1+0.03),meses);
		
	return inve;
	}
}

