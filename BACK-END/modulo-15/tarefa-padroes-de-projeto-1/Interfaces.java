interface Carro {
    void exibirInformacao();
    void setCor(String cor);
}

interface Motor {
    void exibirTipo();
}

interface FabricaDeCarros {
    Carro criarCarro(String cor);
    Motor criarMotor(int idade);
}
