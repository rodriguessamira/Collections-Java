public class Convidado {
   //atibutos
    private String nome;
    private int codigoConvidado;

public Convidado(String nome, int codigoConvidado) {
    this.nome = nome;
    this.codigoConvidado = codigoConvidado;
}
public String getNome() {
    return nome;
}
public int getCodigoConvite() {
    return codigoConvidado;
}
@Override
    public String toString() {
        return "Convidado nome= " + nome + 
        ", codigo do Convidado= " + codigoConvidado + 
        "";
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        //adicionando convidados ao conjunto
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1236);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1237);

        //exibindo os convidados no conjunto
        System.out.println("\nCONVIDADOS NO CONJUNTO:");
        conjuntoConvidados.exibirConvidados();

        //exibindo o número atualizado de convidados no conjunto
        System.out.println("\nExistem "+conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção" );

        // Removendo um convidado do conjunto por código de convite
        conjuntoConvidados.removarConvidadoPorCodigoConvite(1237);

        // Exibindo os convidados atualizados no conjunto
        System.out.println("\nCONVIDADOS NO CONJUNTO APÓS A REMOÇÃO:");
        conjuntoConvidados.exibirConvidados();
    }
}
