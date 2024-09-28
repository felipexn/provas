/**
 * @author felipe
 */

import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite o tamanho da concessionaria");
        int tamanho= entrada.nextInt();
        
        Concessionaria con1 = new Concessionaria(tamanho);
        Moto m1;
        Carro c1;
        
        for(int i=0; i<con1.listaVeiculo.length;i++){
            System.out.println("Digite o tipo de veiculo '1' para carro '2' para moto ");
            int tipo = entrada.nextInt();
            if(tipo==1){
                System.out.println("Digite o ano e o valor do carro");
                int ano=entrada.nextInt();
                entrada.nextLine();
                double valor = entrada.nextDouble();
                c1 = new Carro(1,ano,valor); 
                con1.cadastra(c1);
                
            }
              else{
                System.out.println("Digite o ano o valor e a cilidrada da moto");
                int ano=entrada.nextInt();
                entrada.nextLine();
                double valor = entrada.nextDouble();
                entrada.nextLine();
                int cilindradas = entrada.nextInt();
                m1 = new Moto(2,ano,valor,cilindradas);
                
                con1.cadastra(m1);
                
            }    
        }
        System.out.println("Voce quer visualizar veiculos a partir de qual ano?");
        int anov = entrada.nextInt();
        
            
            con1.resumo(con1.listaVeiculo,anov);
              
         entrada.close();           
    }  
}
