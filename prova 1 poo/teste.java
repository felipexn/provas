
/**
 * @author felipe
 */
import java.util.Scanner;
public class teste {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o nome da discplina: ");
        String disciplina = entrada.nextLine();
        
        System.out.println("Digite o ano da disciplina: ");
        int ano = entrada.nextInt();
        
        System.out.println("Digite a quantidade de alunos: ");
        int numeroA = entrada.nextInt();
        entrada.nextLine();
        Disciplina d1 = new Disciplina(disciplina,ano,numeroA);
        
        String nomeA;
        
        
        for (int i = 0; i < numeroA; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1));
            nomeA = entrada.nextLine();
            d1.matriculados[i] = new Aluno(nomeA, Math.random() * 10.);
        }
        
        double soma=0.0;
        double maior=0.0;
        String alunoMaior="";

        for (int i = 0; i < numeroA; i++) {
            soma=soma+d1.matriculados[i].getNota();
            if(maior>d1.matriculados[i].getNota())
                maior=d1.matriculados[i].getNota();
                alunoMaior=d1.matriculados[i].getNome();
        }

        double media=0.0;
        media=soma/numeroA;

        System.out.println("maior nota" + maior +"media das notas dos alunos " + media );
        //System.out.println(d1.matriculados[1].getNome());
        System.out.println("aluno com maior nota: " + alunoMaior);
        
        for(Aluno it : d1.matriculados){
            System.out.println("nome do aluno: " + it.getNome());
            System.out.println("nota do aluno: " + it.getNota());
            
        }
        
    }
    
}
