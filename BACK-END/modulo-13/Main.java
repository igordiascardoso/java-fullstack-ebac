abstract class Pessoa {
    String nome;
    int idade;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void mostrarIdentificacao();

}


class PFisica extends Pessoa {
    long cpf;

        public PFisica(long cpf, String nome, int idade){
            super(nome, idade);
            this.cpf=cpf;



        }

        @Override
        public void mostrarIdentificacao() {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Cpf: "+cpf);
    }

    }



class PJuridica extends Pessoa {
    long cnpj;
    String nomeFantasia;

        public PJuridica(long cnpj, String nomeFantasia, String nome, int idade){
            super(nome,idade);
            this.cnpj=cnpj;
            this.nomeFantasia=nomeFantasia;


        }

            @Override
            public void mostrarIdentificacao(){
                System.out.println("Nome: "+ nome);
                System.out.println("Idade: "+ idade);
                System.out.println("Cnpj: "+cnpj);
                System.out.println("Nome fantasia: "+nomeFantasia);


        }
}

public class Main{
    public static void main(String[] args) {

        PFisica pf = new PFisica(12345678912L,"Igor",26);
        PJuridica pj = new PJuridica(123456789789789L,"MixMagazine","João",36);

        pf.mostrarIdentificacao();
        System.out.println();
        pj.mostrarIdentificacao();

    }

}