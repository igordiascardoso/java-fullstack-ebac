import java.util.ArrayList;
import java.util.List;

abstract class Carro {
    String marca;
    int velocidade;

    public Carro(String marca, int velocidade) {
        this.marca = marca;
        this.velocidade = velocidade;
    }

    public abstract void mostramarcaeVelocidade();
}

class Honda extends Carro {
    boolean garantia;

    public Honda(boolean garantia, String marca, int velocidade) {
        super(marca, velocidade);
        this.garantia = garantia;
    }

    @Override
    public void mostramarcaeVelocidade() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade: " + velocidade);
        if (garantia) {
            System.out.println("Carro possui garantia infinita.");
        } else {
            System.out.println("Carro não possui garantia.");
        }
    }
}

class Nissan extends Carro {
    boolean gasolina;

    public Nissan(boolean gasolina, String marca, int velocidade) {
        super(marca, velocidade);
        this.gasolina = gasolina;
    }

    @Override
    public void mostramarcaeVelocidade() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade limite: " + velocidade);
        if (gasolina) {
            System.out.println("Carro possui gasolina infinita.");
        } else {
            System.out.println("Carro não tem gasolina grátis.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Nissan(true, "Nissan", 330));
        carros.add(new Honda(true, "Honda", 330));
        carros.add(new Nissan(false, "Nissan", 280));
        carros.add(new Honda(false, "Honda", 250));

        for (Carro carro : carros) {
            carro.mostramarcaeVelocidade();
            System.out.println();
        }
    }
}
