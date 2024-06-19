public class main {
    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumero somaNumero = new SomaNumero(null);
    
        // Adicionando números à lista
        somaNumero.adicionarNumeros(5);
        somaNumero.adicionarNumeros(0);
        somaNumero.adicionarNumeros(0);
        somaNumero.adicionarNumeros(-2);
        somaNumero.adicionarNumeros(10);
    
        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumero.exibirNumeros();
    
        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumero.calcularSoma());
    
        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumero.encontrarMaiorNumero());
    
        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumero.encontrarMenorNumero());
      }
}
