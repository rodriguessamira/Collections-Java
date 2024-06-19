import java.util.ArrayList;
import java.util.List;

public class ListadeItens {
    private List<CarrinhoDeCompras> itensList;
    
    public ListadeItens(){
        this.itensList = new ArrayList<>();
    }
    

    public void adicionarItem(String nome, double preco, int quantidade){
        CarrinhoDeCompras item = new CarrinhoDeCompras(nome,preco,quantidade);
        this.itensList.add(item);
    }

    public void removerItem(String nome){
        List<CarrinhoDeCompras> itensParaRemover = new ArrayList<>();
        for (CarrinhoDeCompras c : itensList) {
            if (c.getDescricao().equalsIgnoreCase(nome)) {
               itensParaRemover.add(c);
            }
        }
        itensList.removeAll(itensParaRemover);
        System.out.println("Tarefa" +itensParaRemover+ "removida! \nTarefas atuais: "+itensList);
    }

    public double calcularValorTotal(){
        double valorTotal=0;
        //List<CarrinhoDeCompras> itensParaCalcular = new ArrayList<>();
        for (CarrinhoDeCompras item : itensList) {
            double valorItem = item.getPreco()*item.getQuant();
            valorTotal+=valorItem;
        }
        return valorTotal;
        }

    public void exibirItens(){
        if (!itensList.isEmpty()) {
            System.out.println(this.itensList);
          } else {
            System.out.println("A lista está vazia!");
          }
    }
}
