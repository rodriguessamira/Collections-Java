public class CarrinhoDeCompras {
    @Override
    public String toString() {
        return "CarrinhoDeCompras [descricao=" + nome + "]";
    }

    private String nome;
	private double preco;
	private int quant;

    public CarrinhoDeCompras(String nome, double preco, int quant) {
        this.nome = nome;
		this.preco = preco;
		this.quant = quant;
    }

    public String getDescricao() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    public int getQuant(){
        return quant;
    }
    public static void main(String[] args) {
        ListadeItens lista = new ListadeItens();

        lista.adicionarItem("banana", 20.00, 5);
        lista.adicionarItem("maca", 2.50, 2);
        lista.adicionarItem("biscoito", 1.5, 3);
        lista.removerItem("banana");
        lista.exibirItens();
        System.out.println("O valor total da compra é de:"+lista.calcularValorTotal()); 



    }
}
