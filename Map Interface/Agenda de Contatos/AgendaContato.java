
import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
  //atributo
  private Map<String, Integer> agendaContatoMap;

  public AgendaContato() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer telefone) {
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if (!agendaContatoMap.isEmpty()) {
      agendaContatoMap.remove(nome);
    } else {
      System.out.println("A agenda de contatos está vazia.");
    }
  }

  public void exibirContatos() {
    if (!agendaContatoMap.isEmpty()) {
      System.out.println(agendaContatoMap);
    } else {
      System.out.println("A agenda de contatos está vazia.");
    }
  }

  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if (!agendaContatoMap.isEmpty()) {
      numeroPorNome = agendaContatoMap.get(nome);
      if (numeroPorNome == null) {
        System.out.println("Contato não encontrado na agenda.");
      }
    } else {
      System.out.println("A agenda de contatos está vazia.");
    }
    return numeroPorNome;
  }  
 public static void main(String[] args) {
     
      AgendaContato agenda = new AgendaContato();

      //adicionando contato
      agenda.adicionarContato("Maria", 123456);
      agenda.adicionarContato("José", 111111);
      agenda.adicionarContato("João", 2222);
      agenda.adicionarContato("Marta", 444444);

      //exibindo contato
      agenda.exibirContatos();

      // Remover um contato
      agenda.removerContato("Maria");
      agenda.exibirContatos();

      // Pesquisar número por nome
      String nomePesquisa = "João";
      Integer numeroPesquisa = agenda.pesquisarPorNome("João");
      System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

      String nomePesquisaNaoExistente = "Priscila";
      Integer numeroPesquisaNaoExistente = agenda.pesquisarPorNome(nomePesquisaNaoExistente);
      System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);


  }
}
