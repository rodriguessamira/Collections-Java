import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removarConvidadoPorCodigoConvite(int  codigoConvite){
        Convidado convidadoParaRemover = null;
        if (!convidadoSet.isEmpty()) {                
            for (Convidado c : convidadoSet) {
                if(c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadoSet.remove(convidadoParaRemover);
        } else {
            throw new RuntimeException("Não há convidado com esse código de convite");
        }
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        if (!convidadoSet.isEmpty()) {
            System.out.println(convidadoSet);
          } else {
            System.out.println("O conjunto está vazio!");
        }
    }
}    
