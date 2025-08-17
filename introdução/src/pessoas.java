// Definição da classe Pessoa
public class pessoas {
    // Atributos privados (encapsulamento)
    // 'private' significa que só podem ser acessados dentro desta classe
    private String nome;
    private String cpf;

    // Construtor da classe
    // É chamado automaticamente quando criamos uma nova Pessoa
    // Recebe dois parâmetros: nome e cpf
    public pessoas(String nome, String cpf) {
        // 'this.nome' se refere ao atributo da classe
        // 'nome' (sem this) é o parâmetro recebido
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getter (serve para pegar o valor do atributo 'nome')
    public String getNome() {
        return nome;
    }

    // Getter (serve para pegar o valor do atributo 'cpf')
    public String getCpf() {
        return cpf;
    }

    // Método para exibir os dados no terminal
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
