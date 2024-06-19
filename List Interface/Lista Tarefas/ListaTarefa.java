
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefas(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if ( t.getDescricao().equalsIgnoreCase(descricao)) {
               tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
        System.out.println("Tarefa" +tarefasParaRemover+ "removida! \nTarefas atuais: "+tarefaList);
    }
    public int  obterNumeroTotalTarefas(){
        return  tarefaList.size();
    }
    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }
    /*public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        System.out.println(listaTarefa.adicionarTarefas(descricao));
    }*/
}
