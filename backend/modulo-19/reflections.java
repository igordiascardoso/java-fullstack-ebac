import java.lang.reflect.*;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Igor", 26);

        // Obtendo o nome da classe em tempo de execução usando reflexões
        Class<?> classePessoa = pessoa.getClass();

        // Obtendo o nome da "tabela" (ou seja, o nome da classe) usando reflexões
        String nomeDaTabela = classePessoa.getSimpleName();

        // Imprimindo o nome da "tabela" no console
        System.out.println("Nome da tabela: " + nomeDaTabela);

        // Imprimindo os detalhes da pessoa
        System.out.println(pessoa.toString());
    }
}
