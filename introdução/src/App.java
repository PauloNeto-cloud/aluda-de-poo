// Classe principal do programa
// É aqui que o programa começa (main)
public class App {
    // Método principal que roda quando executamos o programa
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        // Chamamos o construtor e passamos nome e CPF
        pessoas p1 = new pessoas("João Silva", "123.456.789-00");

        // Criando outro objeto Pessoa
        pessoas p2 = new pessoas("Maria Oliveira", "987.654.321-00");

        // Chamando o método exibirDados() para mostrar no terminal
        p1.exibirDados();

        // Linha em branco só para separar as saídas
        System.out.println();

        // Exibindo dados da segunda pessoa
        p2.exibirDados();
    }
}
