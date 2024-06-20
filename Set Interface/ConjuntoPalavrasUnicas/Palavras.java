public class Palavras {
    private String palavra;
    
    public Palavras(String palavra) {
        this.palavra = palavra;
    }
    public String getPalavra() {
        return palavra;
    }
    @Override
    public String toString() {
        return "Palavra=" + palavra ;
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        //adicionando palavras
        conjunto.adicionarPalavra("Palavra 1");
        conjunto.adicionarPalavra("Palavra 2");
        conjunto.adicionarPalavra("Palavra 3");
        conjunto.adicionarPalavra("Palavra 4");
        conjunto.adicionarPalavra("Palavra 5");

        //Exibindo palavras adicionadas
        System.out.println("\nPALAVRAS ADICIONADAS");
        conjunto.exibirPalavrasUnicas();
        System.out.println("\n");

        //verificar se há a palavra no conjunto
        conjunto.verificarPalavra("Palavra 1");

        //removendo as palavras
        conjunto.removerPalavra("Palavra 2");
        conjunto.removerPalavra("Palavra 3");

        //exibir palavras após a remoção
        System.out.println("\nPALAVRAS APÓS A REMOCAO");
        conjunto.exibirPalavrasUnicas();
        System.out.println("\nA palavra 1 está no conjunto? " + conjunto.verificarPalavra("Palavra 1"));
        System.out.println("\nA palavra 3 está no conjunto? " + conjunto.verificarPalavra("Palavra 3"));

    }

}   
