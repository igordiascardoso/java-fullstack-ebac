abstract class Carro{
    String marca;
    int velocidade;

        public Carro(String marca, int velocidade){
            this.marca=marca;
            this.velocidade=velocidade;
        }

        public abstract void mostramarcaeVelocidade();
}



class Honda extends Carro{
    static boolean garantia;

    public Honda (boolean garantia, String marca, int velocidade){
        super(marca, velocidade);
        this.garantia=garantia;

    }

    @Override
    public void mostramarcaeVelocidade(){
        System.out.println("Marca : "+marca);
        System.out.println("Velocidade: " +velocidade);
        if (garantia == true){
            System.out.println("Carro possui garantira infinita.");
        } else {
            System.out.println("Carro não possui gasolina");
        }
        }
    }

class Nissan extends Carro{
    static boolean gasolina;

    public Nissan(boolean garantia, String marca, int velocidade){
        super(marca, velocidade);
        this.gasolina = gasolina;

    }

    @Override
    public void mostramarcaeVelocidade(){
        System.out.println("Marca: "+marca);
        System.out.println("Velocidade limite: " +velocidade);
        if (gasolina == true){
            System.out.println("Carro possui gasolina infinita.");
        } else {
            System.out.println("Carro não tem gasolina gratis");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Nissan carro1 = new Nissan(true,"Nissan",330);
        carro1.mostramarcaeVelocidade();
        Honda carro2 = new Honda(true,"HonDA",330);
    }
}

