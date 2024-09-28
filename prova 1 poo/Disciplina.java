
/**
 * @author felipe
 */
public class Disciplina {
    private   String nomeD;
    private int anoD;
    Aluno[] matriculados;
    
    public Disciplina(String nomeD,int anoD,int tamanho){
        this.anoD=anoD;
        this.nomeD=nomeD;
       matriculados = new Aluno[tamanho];
               
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nomeD;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nomeD = nome;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return anoD;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.anoD = ano;
    }

    /**
     * @return the matriculados
     */
    public Aluno[] getMatriculados() {
        return matriculados;
    }

    /**
     * @param matriculados the matriculados to set
     */
    public void setMatriculados(Aluno[] matriculados) {
        this.matriculados = matriculados;
    }
            
    
}
