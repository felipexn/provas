/**
 * @author felipe
 */

public class Carro extends Veiculo {
    double a;
    public Carro(int tipo, int ano,double valorInicial ){
        super(tipo,ano,valorInicial);
    }
    
    public double valor() {
        int auxAno;
        double auxValor;
        auxAno= 2022-getAno();
        //sem nexo
        auxValor=getValorInicial();
        for(int i=0;i<auxAno;i++){
            //System.out.println("asd");
            auxValor=auxValor*0.90;
            
        }
            setValorInicial(auxValor);
                   
        return getValorInicial();
    }
        
    

    
    public String toString(){
    return "Carro de ano: " + getAno() + " e Valor: " + valor();
        }
        }
