class FabricaDeCarrosEletricos implements FabricaDeCarros{
    private String cor;
    private int idade;

    @Override
    public Carro criarCarro(String cor){
        Carro carro = new CarroEletrico();
        carro.setCor(cor);
        return carro;
    }

    @Override
    public Motor criarMotor(int idade){
        if (idade > 30) {
            return new MotorV8();
        } else {
            return new MotorEletrico();
        }

    }
}

class FabricaDeCarrosGasolina implements FabricaDeCarros{
    private String cor;
    private int idade;

    @Override
    public Carro criarCarro(String cor){
        Carro carro = new CarroGasolina();
        carro.setCor(cor);
        return carro;
    }

    @Override
    public Motor criarMotor(int idade){
        if (idade>30){
            return new MotorV8();
        } else {
            return new MotorGasolina();
        }
    }
}