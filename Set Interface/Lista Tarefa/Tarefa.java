public class Tarefa {
    private String descricao;
    private boolean concluida;

    public String getDescricao() {
        return descricao;
    }
    public boolean isConcluida() {
        return concluida;
    }
    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = false;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
    @Override
    public String toString() {
        return "  " + descricao + 
        ", concluida=" + concluida ;
    }
    
    public static void main(String[] args) {
        ListaTarefa tarefa = new ListaTarefa();
        
        //adicionando tarefas
        tarefa.adicionarTarefa("Tarefa 1");
        tarefa.adicionarTarefa("Tarefa 2");
        tarefa.adicionarTarefa("Tarefa 3");
        tarefa.adicionarTarefa("Tarefa 4");
        tarefa.adicionarTarefa("Tarefa 5");
        tarefa.adicionarTarefa("Tarefa 6");

        //exibindo tarefas
        System.out.println("\nTAREFAS");
        tarefa.exibirTarefa();

        //removendo tarefa
        System.out.println("\n");
        tarefa.removerTarefa("Tarefa 2");

        //exibindo após a remoção
        System.out.println("TAREFAS APÓS A REMOÇÃO");
        tarefa.exibirTarefa();

        //mostrando quantas tarefas há após remoção
        System.out.println("\nHá um total de "+tarefa.contarTarefas() +" tarefas");

        //tarefas pendentes
        System.out.println("\nTAREFAS PENDENTES\n"+tarefa.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        tarefa.marcarTarefaConcluida("Tarefa 1");
        tarefa.marcarTarefaConcluida("Tarefa 4");

        // Obtendo tarefas concluídas
        System.out.println("\nTAREFAS CONCLUIDAS\n"+tarefa.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        System.out.println("\nTAREFA PENDENTE MARCADA");
        tarefa.marcarTarefaPendente("Tarefa 3");
        tarefa.exibirTarefa();

        // Limpando a lista de tarefas
        System.out.println("\nTAREFAS APAGADAS");
        tarefa.limparListaTarefas();
        tarefa.exibirTarefa();


    }

   
}
