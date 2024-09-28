/**
 * @author felipe
 */

import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Ponto a = new Ponto();
        Ponto b = new Ponto();
        Ponto c = new Ponto();
        Ponto d = new Ponto();
        
        System.out.println("Digite o valor de x e y do ponto A " );
        double aaux = entrada.nextDouble();
        a.setCoodernadaX(aaux);
        double aauy = entrada.nextDouble();
        a.setCoodernadaY(aauy);
        
        System.out.println("Digite o valor de x e y do ponto B");
        double baux = entrada.nextDouble();
        b.setCoodernadaX(baux);
        double bauy = entrada.nextDouble();
        b.setCoodernadaY(bauy);

        System.out.println("Digite o valor de x e y do ponto c " );
        double caux = entrada.nextDouble();
        a.setCoodernadaX(caux);
        double cauy = entrada.nextDouble();
        a.setCoodernadaY(cauy);
        
        System.out.println("Digite o valor de x e y do ponto d");
        double daux = entrada.nextDouble();
        b.setCoodernadaX(daux);
        double dauy = entrada.nextDouble();
        b.setCoodernadaY(dauy);
        
        double distanciaAB = Operacoes.distancia(a, b);
        double areaAB = Operacoes.areaRetangulo(a, b);
        System.out.println("Área do retângulo entre A e B: " + areaAB);
        System.out.println("Distância entre os pontos A e B: " + distanciaAB);
       
        double distanciaCD = Operacoes.distancia(c, d);
        double areaCD = Operacoes.areaRetangulo(c, d);
        System.out.println("Área do retângulo entre C e D: " + areaCD);
        System.out.println("Distância entre os pontos C e D: " + distanciaCD);


        entrada.close();         
    }
    
}
