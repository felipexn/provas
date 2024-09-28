
/**
 * @author felipe
 */

 public class Operacoes {

    public static double distancia(Ponto a, Ponto b) {
        double resultado = Math.pow(a.getCoodernadaX() - b.getCoodernadaX(), 2) 
                         + Math.pow(a.getCoodernadaY() - b.getCoodernadaY(), 2);
        return Math.sqrt(resultado); 
    }

    public static double areaRetangulo(Ponto a, Ponto b) {
        double base = Math.abs(a.getCoodernadaX() - b.getCoodernadaX()); 
        double altura = Math.abs(a.getCoodernadaY() - b.getCoodernadaY()); 
        return base * altura; 
    }
}