/**
 * @author felipe
 */

public class OnibusHibrido extends Onibus implements AGasolina,Eletrico {
    private int voltagem;
    public OnibusHibrido(int id, int capacidade, int voltagem){
        super(id,capacidade);
        this.voltagem=voltagem;
        
    }
   

    public double getGrauEmissao() {
        double emissao;
        emissao=Math.log10(getCapacidade()/2);
        return emissao;
    }
    
    public double getAceleraçao() {
    double aux,aceleracao;
    aux = getGrauEmissao();
    aceleracao=(getVoltagem()/15)*Math.sqrt(aux);
    return aceleracao;
    }
    
    
    public double getConsumo() {
    double auxE,auxA,consumo;
    auxE=getGrauEmissao();
    auxA=getAceleraçao();
    consumo=Math.sqrt(auxA*getCapacidade()*0.8)*Math.pow(auxE,2);
    return consumo;
    }

    
    public String toString() {
       return "\nOnibus hibrido"+super.toString()+"\nCom consumo de: "+getConsumo()+"\nCom emissao de: "+getGrauEmissao()+"\nE aceleracao de:"+getAceleraçao(); 
    }

    /**
     * @return the voltagem
     */
    public int getVoltagem() {
        return voltagem;
    }

    /**
     * @param voltagem the voltagem to set
     */
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    

    
}
