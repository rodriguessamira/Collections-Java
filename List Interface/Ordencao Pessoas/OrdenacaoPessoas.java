import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.setPessoaList(new ArrayList<>());
    }

    public List<Pessoa> getPessoaList() {
        return pessoaList;
        
    }

    public void setPessoaList(List<Pessoa> pessoaList) {
        this.pessoaList = pessoaList;
        
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        getPessoaList().add(new Pessoa(nome, idade, altura));     
    }
    public List<Pessoa>ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(getPessoaList());
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(getPessoaList());    
        Collections.sort(pessoasPorAltura,new ComparetorPorAltura());
        return pessoasPorAltura;
    }
}
