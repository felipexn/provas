
/*
 * @author felipe
 */
public class Aluno {
    private String nome;
    private double nota;
    
    public Aluno(String nome, double nota){
        this.nome=nome;
        this.nota=nota;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = nota;
    }
    
}
