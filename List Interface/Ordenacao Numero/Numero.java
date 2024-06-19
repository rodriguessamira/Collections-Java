
public class Numero implements Comparable<Numero>{
    @Override
    public String toString() {
        return "Numero=" + numero + "";
    }

    private int numero;

    public Numero (int numero){
        this.numero = numero;
    }
    @Override
    //método para comparação dos numeros
    public int compareTo(Numero n) {
        return Integer.compare(numero, n.getNumero());
    }

    public int getNumero() {
        return numero;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(2);

        System.out.println(ordenacaoNumeros.getNumeroList());
        System.out.println("\nORDENANDO DO MENOR PARA O MAIOR:\n"+ordenacaoNumeros.ordenarAscendente());
        System.out.println("\nORDENANDO DO MAIOR PARA O MENOR:\n"+ordenacaoNumeros.ordenarDescendente());

    }
}
