/**
 * @author felipe
 */

public class Moto extends Veiculo {
    private int cilidradas;
    public Moto(int tipo, int ano,double valorInicial,int cilidradas){
        super(tipo,ano,valorInicial);
        this.cilidradas=cilidradas;
        
        
    }
    public double valor() {
        int auxAno;
        double auxValor;
        int auxCc;
        
        auxAno= 2022-getAno();
        
        
        auxCc=getCilidradas();
        
        if(auxCc>=200){
            for(int i=0;i<auxAno;i++){
            auxValor=getValorInicial();
            auxValor=auxValor*0.92;
            setValorInicial(auxValor);
        }}
        else{   
        for(int i=0;i<auxAno;i++){
            auxValor = getValorInicial();
            auxValor = auxValor*0.94;
            setValorInicial(auxValor);
        }}
            
                   
        return getValorInicial();
    }
     
    public String toString() {
        return "Moto de "+ getCilidradas()+" cilindradas " + "\nano: "+getAno()+" e valor de:"+valor();
      
    }

    /**
     * @return the cilidradas
     */
    public int getCilidradas() {
        return cilidradas;
    }

    /**
     * @param cilidradas the cilidradas to set
     */
    public void setCilidradas(int cilidradas) {
        this.cilidradas = cilidradas;
    }

   
    
}
