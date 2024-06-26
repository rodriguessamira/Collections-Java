import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  private Map<String, String> dicionario;

  public Dicionario() {
    this.dicionario = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao) {
    dicionario.put(palavra, definicao);
  }

  public void removerPalavra(String palavra) {
    if (!dicionario.isEmpty()) {
      dicionario.remove(palavra);
    } else {
      System.out.println("O dicionário está vazio.");
    }
  }

  public String pesquisarPorPalavra(String palavra) {
    String definicao = dicionario.get(palavra);
    if (definicao != null) {
      return definicao;
    }
    return "Linguagem não encontrada no dicionário.";
  }

  public void exibirPalavras() {
    if (!dicionario.isEmpty()) {
      System.out.println(dicionario);
    } else {
      System.out.println("O dicionário está vazio.");
    }
  }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        //adiconando palavra ao dicionario
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
        
        //exibindo as palvras adicionadas
        System.out.println("EXIBINDO AS PALVRAS ADICIONADAS");
        dicionario.exibirPalavras();

        //removendo palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("\nDefinição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        // Remover uma palavra
        System.out.println("\nAPÓS A REMOÇÃO");
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    } 
}
