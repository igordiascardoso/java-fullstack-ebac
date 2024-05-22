class CarroEletrico implements Carro {
    private String cor;

    @Override
    public void exibirInformacao(){
        System.out.println("Seu carro é eletrico e é da cor: " + cor);
    }

    @Override
    public void setCor(String cor){
        this.cor=cor;
    }
}

class CarroGasolina implements Carro{
    private String cor;

    @Override
    public  void exibirInformacao(){
        System.out.println("Seu carro é a gasolina e é da cor: " + cor);
    }

    @Override
    public void setCor(String cor){
        this.cor=cor;
    }
}

class MotorGasolina implements Motor{

    @Override
    public void exibirTipo(){
        System.out.println("Seu motor é a Gasolina");

    }
}

class MotorEletrico implements Motor{

    @Override
    public void exibirTipo(){
        System.out.println("Seu motor é Elétrico");
    }
}

class MotorV8 implements Motor{

    @Override
    public void exibirTipo(){
        System.out.println("Seu motor é V8");
    }
}

