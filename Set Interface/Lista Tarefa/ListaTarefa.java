import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> tarefaSet;

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }
    public void exibirTarefa(){
        System.out.println(tarefaSet);
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {                
            for (Tarefa t : tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            throw new RuntimeException("Não há tarefas");
        }if(tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
          }
    }
    public int contarTarefas(){
        return tarefaSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
          if (t.isConcluida()) {
            tarefasConcluidas.add(t);
          }
        }
        return tarefasConcluidas;
      }
      public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
          if (!t.isConcluida()) {
            tarefasNaoConcluidas.add(t);
          }
        }
        return tarefasNaoConcluidas;
      }
      public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
          if (t.getDescricao().equalsIgnoreCase(descricao)) {
            t.setConcluida(true);
          }
        }
      }
    
      public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefaSet) {
          if (t.getDescricao().equalsIgnoreCase(descricao)) {
            tarefaParaMarcarComoPendente = t;
            break;
          }
        }
        if (tarefaParaMarcarComoPendente != null) {
            if(tarefaParaMarcarComoPendente.isConcluida()) {
              tarefaParaMarcarComoPendente.setConcluida(false);
            }
          } else {
            System.out.println("Tarefa não encontrada na lista.");
          }
        }
        public void limparListaTarefas() {
          if(tarefaSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
          } else {
            tarefaSet.clear();
            }
        }
}
