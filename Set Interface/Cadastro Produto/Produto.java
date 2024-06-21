
import java.util.Comparator;
import javax.swing.text.GapContent;

public class Produto implements Comparable<Produto>{
    
    private long codigo;
    private double preco;
    private String nome;
    private int quantidade;

    public Produto(long codigo, double preco, String nome, int quantidade) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
    }
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }


    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
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
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + 
        ", preco=" + preco + ", nome=" + nome + 
        ", quantidade=" + quantidade + "\n";
    }

    public static void main(String[] args) {
        CadastroProduto cadastro = new CadastroProduto();
        
        // Adicionando produtos ao cadastro
        cadastro.adicionarProduto(01, "Smartphone", 1000d, 10);
        cadastro.adicionarProduto(02, "Notebook", 1500d, 5);
        cadastro.adicionarProduto(03, "Mouse", 30d, 20);
        cadastro.adicionarProduto(04, "Teclado", 50d, 15);

        //Exibindo todos os produtos no cadastro
        System.out.println("EXIBINDO PRODUTOS\n"+cadastro.produtoSet);

        //Exibindo produtos ordenados por preço
        System.out.println("\nEXIBINDO POR PREÇO:\n"+cadastro.exibirPorPreco());

        // Exibindo produtos ordenados por nome
        System.out.println("EXIBINDO POR NOME:\n"+cadastro.exibirProdutoPorNome());
    
    }
}
class ComparatorPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
