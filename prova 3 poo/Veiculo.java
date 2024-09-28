
/**
 * @author felipe
 */

public abstract class Veiculo {
    private int tipo;
    private int ano;
    private double valorInicial;
     public Veiculo(int tipo, int ano, double valorInicial){
         this.ano=ano;
         this.tipo=tipo;
         this.valorInicial=valorInicial;
     }
     public abstract double  valor();
     public abstract String toString();    
     

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the valorInicial
     */
    public double getValorInicial() {
        return valorInicial;
    }

    /**
     * @param valorInicial the valorInicial to set
     */
    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }
    
}
