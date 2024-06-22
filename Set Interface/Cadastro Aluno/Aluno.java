import java.util.Comparator;

public class Aluno implements Comparable<Aluno>{
    
    private String nome;
    private Long matricula;
    private double media;

    public Aluno(Long matricula, double media, String nome) {
        this.matricula = matricula;
        this.media = media;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }
    @Override
    public String toString() {
        return "Aluno " + nome + ", matricula=" 
        + matricula + ", media=" + media + "\n";
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(media);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (Double.doubleToLongBits(media) != Double.doubleToLongBits(other.media))
            return false;
        return true;
    }

    public static void main(String[] args) {
        CadastroAluno aluno = new CadastroAluno();

        //adicionar aluno
        aluno.adicionarAluno("Maria", 111111, 7.5);
        aluno.adicionarAluno("João", 22222, 10);
        aluno.adicionarAluno("Valentina", 333333, 9.5);
        aluno.adicionarAluno("Enzo", 444444, 8);
        aluno.adicionarAluno("Sofia", 555555, 6.5);

        //exibindo os alunos adicionados
        System.out.println("ALUNOS ADICIONADOS\n"+aluno.alunoSet);
        
        //exibindo os alunos por média
        System.out.println("\nEXIBINDO POR MÉDIA:");
        aluno.exibirPorMedia();

        //exibindo por nome
        System.out.println("\nEXIBINDO POR NOME:");
        aluno.exibirPorNome();

        //removendo aluno por Matricula
        aluno.removerAlunoPorMatricula(111111);
        aluno.removerAlunoPorMatricula(444444);
        System.out.println("\nEXIBINDO APÓS REMOVER ALUNOS\n"+aluno.alunoSet);

    }
    
}
class ComparatorPorMedia implements Comparator<Aluno>{
    public int compare(Aluno m1, Aluno m2){
        return Double.compare(m1.getMedia(), m2.getMedia());
    }
}