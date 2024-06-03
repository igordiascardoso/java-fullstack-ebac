import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Tabela(nome = "Pessoa")
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

        // Obtendo a anotação da classe
        if (classePessoa.isAnnotationPresent(Tabela.class)) {
            Tabela anotacao = classePessoa.getAnnotation(Tabela.class);

            // Obtendo o nome da "tabela" da anotação
            String nomeDaTabela = anotacao.nome();

            // Imprimindo o nome da "tabela" no console
            System.out.println("Nome da tabela: " + nomeDaTabela);
        } else {
            System.out.println("A anotação Tabela não está presente na classe Pessoa.");
        }

        // Imprimindo os detalhes da pessoa
        System.out.println(pessoa.toString());
    }
}
