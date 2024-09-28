/**
 * @author felipe
 */

public class OnibusGasolina extends Onibus implements AGasolina{

    public OnibusGasolina(int id, int capacidade){
        super(id,capacidade);
    }
   
    public double getGrauEmissao() {
        
        double emissao;
        emissao= Math.pow(getCapacidade(),2)*Math.log10(getCapacidade());
        return emissao;
    }
    
    public double getAceleraçao() {
        double aux= getGrauEmissao();
        double aceleracao;
        aceleracao = aux/15;
        return aceleracao;
        
     
    }
    
    public String toString() {
       return  "\nOnibus a gasolina "+super.toString()+"\nCom grau de missao de: "+getGrauEmissao()+"\nE aceleracao de:"+getAceleraçao();
        
    }
    
}
