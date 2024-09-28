/**
 * @author felipe
 */

public class OnibusEletrico extends Onibus implements Eletrico{
private int voltagem;
public OnibusEletrico(int id,int capacidade,int voltagem){
        super(id,capacidade);
        this.voltagem=voltagem;
}
    
    public double getAceleraçao() {
        double aceleracao;
        aceleracao=getVoltagem()/15;
        return aceleracao;
      
    }

   

    
    public double getConsumo() {
    double aux ,consumo;
    aux=getAceleraçao();
    consumo=aux*getCapacidade()*0.8;
    return consumo;
    }
     
    public String toString() {
     return "\nOnibus eletrico"+super.toString()+"\nCom consumo de: "+getConsumo()+"\nE aceleracao de:"+getAceleraçao(); 
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
