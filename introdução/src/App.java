public class App {
    public static void main(String[] args) {
        // Criando um objeto Pessoa
        pessoas p1 = new pessoas("Paulo", "123.456.789-00");

        // Exibindo os dados originais
        p1.exibirDados();

        // Alterando o nome usando o setter
        p1.setNome("Paulo Neto");

        // Exibindo os dados após alteração
        p1.exibirDados();
    }
}
