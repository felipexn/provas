//luiz felipe souza vasconcelos
//professor: claudio coutinho
//data:04/12/2021

#include <stdio.h>
#include <conio.h>
int main(){
	float nota, manota, menota = 10, totalnota;
	int faltas, totaldias, totalaluno, a;
	
	printf("Digite a quantidade de dias\n");
	scanf("%d", &totaldias);
	
	
	while(nota != -1){
		printf("Digite nota e numero de faltas do aluno ");
		scanf("%f %d",&nota, &faltas);
		
		     if( nota >= 0 && nota < 5){
	    printf("Aluno:INS\n");
	}
		
	    else if(nota >= 5 && nota < 7){
	    printf("Aluno:REG\n");
	}
		
	    else if(nota >= 7 && nota < 9){
	    printf("Aluno:BOM\n");
	}
		
	    else if(nota >= 9 && nota <= 10){
	    printf("Aluno:EXC\n");
	}
	    	
	    else if( nota > 10 || nota < 0)
	    printf("Nota incorreta\n");
	    
		if(faltas > totaldias*0.75) 
		printf("Reprovado por SFR\n");
	    
		totalaluno++;
		totalnota += nota;
	
		  if(nota > manota)
	       manota=nota;
	       
	      else if(nota != -1 && nota != 0){
	      if(nota < menota)
	       menota = nota;}
	      }
	      
	     /* switch(a){
	      	case 1:
			  printf("total de alunos: %i\n", totalaluno);
			  break;
			case 2:
				printf("\b\b\bmaior nota:%.2f\n",manota);
				break;
			case 3:
				printf("menor nota:%.2f\n",menota);
				break;
			case 4:
				printf("media: %.2f ",totalnota/totalaluno);
				break;
			case 5:
				printf("faltou essa mas com mais uma hr faria de boa");
				break;
			case 6:
				printf("essa tbm T.T");
			default:
				printf("encerrado!\n");
				
				
		  }*/
	printf("\b\b\bMaior nota:%.2f\n",manota);
	printf("Menor nota:%.2f\n",menota);
	printf("Total de alunos: %i\n", totalaluno);
	printf("Soma das notas: %.2f\n",totalnota);
	printf("Media: %.2f ",totalnota/totalaluno);
		
	getch();
	return 0;
}
