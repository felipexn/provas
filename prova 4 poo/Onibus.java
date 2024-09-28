/**
 * @author felipe
 */

public abstract class  Onibus {
    private int id;
    private int capacidade;
    public Onibus(int id, int capacidade){
        this.capacidade=capacidade;
        this.id=id;
    }
      public abstract double  getAceleraçao();
      public  String toString(){
          return "\nId: "+getId()+"\nCom capacidade de: "+getCapacidade();
      }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
          
      
              
    
}
