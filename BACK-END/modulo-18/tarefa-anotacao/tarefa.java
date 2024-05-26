public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome,int idade){
        this.nome=nome;
        this.idade=idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Igor",26);
        pessoa.toString();

        System.out.println(pessoa.toString());
    }
}