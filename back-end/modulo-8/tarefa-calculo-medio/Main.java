import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c,d,notaMedia;

        Scanner read = new Scanner(System.in);


        System.out.println("Insira sua primeira nota:");
        a = read.nextInt();

        System.out.println("Insira sua segunda nota:");
        b = read.nextInt();

        System.out.println("Insira sua terceira nota:");
        c = read.nextInt();

        System.out.println("Insira sua quarta nota:");
        d = read.nextInt();



        System.out.println("Sua média é: "+Math(a,b,c,d));
    }
}