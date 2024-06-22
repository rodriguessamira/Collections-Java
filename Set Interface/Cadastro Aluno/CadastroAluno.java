import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroAluno {
    public Set<Aluno> alunoSet;

    public CadastroAluno() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(matricula, media, nome));
    }

    public void exibirPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio");
        } 
    }

    public void exibirPorMedia(){
        Set<Aluno> alunoPorMedia = new TreeSet<>(new ComparatorPorMedia());
       if (!alunoSet.isEmpty()) {
            alunoPorMedia.addAll(alunoSet);
            System.out.println(alunoPorMedia);
       } else {
            throw new RuntimeException("O conjunto está vazio!");
       }
    }

    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
          for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
              alunoParaRemover = a;
              break;
            }
          }
          alunoSet.remove(alunoParaRemover);
        } else {
          throw new RuntimeException("O conjunto está vazio!");
        }
    
        if (alunoParaRemover == null) {
          System.out.println("Matricula não encontrada!");
        }
      }
    
    }
