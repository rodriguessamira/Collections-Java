import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    // atributo
    private List<Numero> numeroList;
    
    public OrdenacaoNumeros(){
        this.setNumeroList(new ArrayList<>());
    }
    
    private void setNumeroList(List<Numero> numeroList) {
       this.numeroList = numeroList;
    }

    public List<Numero> getNumeroList() {
        return numeroList;
    }
    public void adicionarNumero(int numero){
        getNumeroList().add(new Numero (numero));
    }

    public List<Numero>ordenarAscendente(){
        List<Numero> numeroAscendente = new ArrayList<>(getNumeroList());
        if (!numeroList.isEmpty()) {
            Collections.sort(numeroAscendente);
            return numeroAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Numero>ordenarDescendente(){
        List<Numero> numeroDescendente = new ArrayList<>(getNumeroList());
        if (!numeroList.isEmpty()) {
            numeroDescendente.sort(Collections.reverseOrder());
            return numeroDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
       
    }
    
}
