
public class pessoas {
    private String nome;
    private String cpf;

    //construtor
    public pessoas(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;   
    }

    //getters
    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    //metodo para exebir
    public void exibirDados(){
        System.out.println("nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}