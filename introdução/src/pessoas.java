// Definição da classe Pessoa
public class pessoas {
    // Atributos privados (encapsulamento)
    // Só podem ser acessados dentro desta classe
    private String nome;
    private String cpf;

    // Construtor da classe
    // É chamado quando criamos um novo objeto Pessoa
    // Recebe dois parâmetros: nome e cpf
    public pessoas(String nome, String cpf) {
        // 'this.nome' se refere ao atributo da classe
        // 'nome' é o valor passado como parâmetro
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getter para o nome
    // Permite acessar o valor do atributo 'nome' fora da classe
    public String getNome() {
        return nome;
    }

    // Getter para o CPF
    // Permite acessar o valor do atributo 'cpf' fora da classe
    public String getCpf() {
        return cpf;
    }

    // Setter para o nome
    // Permite alterar o valor do atributo 'nome' depois que o objeto é criado
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para exibir os dados da pessoa no terminal
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
