public class Contato {
    private String nome;
    private int numero;
    

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Contato = " + nome + 
        ", numero = " + numero + "\n";
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        //adicionando contatos na agenda
        System.out.println("\nEXIBINDO CONTATOS: ");
        agenda.adicionarContato("Maria", 123456789);
        agenda.adicionarContato("João", 234567891);
        agenda.adicionarContato("Maria Rita", 999999999);
        agenda.adicionarContato("Enzo", 345678912);
        agenda.adicionarContato("Bia", 456789123);

        //exibindo contatos adicionados
        agenda.exibirContato();

        //pesquisar contato pelo nome
        System.out.println("\nPESQUISANDO CONTATO");
        System.out.println(agenda.pesquisarPorNome("Maria"));

        //atualizar algum contato 
        Contato contatoAtualizado = agenda.atualizarNumeroContato("Bia", 5555555);
        System.out.println("\nCONTATO ATUALIZADO: " + contatoAtualizado);

        //exibir contatos após a atualização
        System.out.println("CONTATOS APÓS A ATUALIZAÇÃO");
        agenda.exibirContato();

    }

}
