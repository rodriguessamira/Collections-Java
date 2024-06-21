import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    public  Set<Produto> produtoSet;

    public CadastroProduto(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(int codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, preco, nome, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;    
    }

    public Set<Produto>exibirPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!produtoSet.isEmpty()) {
            produtoPorPreco.addAll(produtoSet);
            return produtoPorPreco;
          } else {
            throw new RuntimeException("O conjunto está vazio!");
          }
    }
}
