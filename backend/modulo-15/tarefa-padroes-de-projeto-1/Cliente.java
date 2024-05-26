public class Cliente {
    private FabricaDeCarros fabrica;
    private String nome;
    private int idade;
    private String cor;

    public Cliente(FabricaDeCarros fabrica, String nome, int idade, String cor) {
        this.fabrica = fabrica;
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public void montarCarro() {
        Carro carro = fabrica.criarCarro(cor);
        Motor motor = fabrica.criarMotor(idade);
        System.out.println("Cliente: " + nome + ", Idade: " + idade + ", Cor do carro: " + cor);
        carro.exibirInformacao();
        motor.exibirTipo();
    }

    public static void main(String[] args) {
        // Cliente para carro elétrico
        Cliente clienteEletrico = new Cliente(new FabricaDeCarrosEletricos(), "Alice", 28, "vermelho");
        clienteEletrico.montarCarro();

        // Cliente para carro a gasolina
        Cliente clienteGasolina = new Cliente(new FabricaDeCarrosGasolina(), "Bob", 35, "azul");
        clienteGasolina.montarCarro();
    }


}


