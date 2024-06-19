import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    //atributos
    private String nome;
    private int idade;
    private double altura;
    
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    //método para comparação das idades
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
     }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    public String toString() {
        return "nome=" + nome + 
        ", idade=" + idade + 
        ", altura=" + altura + 
        "\n";
    }
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
      
        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        System.out.println(ordenacaoPessoas.getPessoaList());

        // Ordenando e exibindo por idade
        System.out.println("\nORDENANDO POR IDADE: \n"+ordenacaoPessoas.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println("\nORDENANDO POR ALTURA: \n"+ordenacaoPessoas.ordenarPorAltura());


        }
}

class ComparetorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
       return Double.compare(p1.getAltura(), p2.getAltura());
        
    }

}
