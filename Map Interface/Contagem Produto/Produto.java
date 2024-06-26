public class Produto {
        //atributos
        private String nome;
        private double preco;
        private int quantidade;
      
        public Produto(String nome, double preco, int quantidade) {
          this.nome = nome;
          this.preco = preco;
          this.quantidade = quantidade;
        }
      
        public String getNome() {
          return nome;
        }
      
        public double getPreco() {
          return preco;
        }
      
        public int getQuantidade() {
          return quantidade;
        }
      
        @Override
        public String toString() {
          return "Produto{" +
              "nome='" + nome + '\'' +
              ", preco=" + preco +
              ", quantidade=" + quantidade +
              '\n';
        }
        public static void main(String[] args) {
            EstoqueProdutos estoque = new EstoqueProdutos();
        
            // Exibe o estoque vazio
            estoque.exibirProdutos();
        
            // Adiciona produtos ao estoque
            estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
            estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
            estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
            estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
        
            // Exibe os produtos no estoque
            System.out.println("\nPRODUTOS ADICIONADOS");
            estoque.exibirProdutos();
        
            // Calcula e exibe o valor total do estoque
            System.out.println("\nValor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        
            // Obtém e exibe o produto mais caro
            Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
            System.out.println("\nProduto mais caro: " + produtoMaisCaro);
        
            // Obtém e exibe o produto mais barato
            Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
            System.out.println("Produto mais barato: " + produtoMaisBarato);
        
            // Obtém e exibe o produto com a maior quantidade em valor no estoque
            Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
            System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
          }
      }
