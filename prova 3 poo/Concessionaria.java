/**
 * @author felipe
 */

public class Concessionaria {
    Veiculo listaVeiculo[];
    private int nCarros;

    public Concessionaria(int tamanho){
        listaVeiculo = new Veiculo[tamanho];
    }

    public void cadastra(Veiculo veiculo){
        
        int i=0;
        if( i < listaVeiculo.length){
        listaVeiculo[i]=veiculo;
        i++;
        }      
    }
        
        
    
    public void resumo(Veiculo listaVeiculo[],int ano){
        int i=0;
        for(i=0;i<listaVeiculo.length;i++){
        if(listaVeiculo[i].getAno()>=ano){
            System.out.println(listaVeiculo[i].toString());
            i++;
        }
    }
    
    }

   

    /**
     * @return the nCarros
     */
    public int getnCarros() {
        return nCarros;
    }

    /**
     * @param nCarros the nCarros to set
     */
    public void setnCarros(int nCarros) {
        this.nCarros = nCarros;
    }

}
