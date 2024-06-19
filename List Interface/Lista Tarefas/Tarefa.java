public class Tarefa {
  
    public String toString() {
        return  descricao + " ";
    }

    private String descricao;

    
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefas("Tarefa 1");
        listaTarefa.adicionarTarefas("Tarefa 2");
        listaTarefa.adicionarTarefas("Tarefa 3");

        System.out.println("O numero total de tarefas sao: "+listaTarefa.obterNumeroTotalTarefas()); 
        listaTarefa.obterDescricaoTarefas();
        listaTarefa.removerTarefa("Tarefa 1");
    }
}
