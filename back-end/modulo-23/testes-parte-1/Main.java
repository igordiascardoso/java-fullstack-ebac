import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Insira a lista:");
        String lerEntrada = read.nextLine();

        String[] nomesESexos = lerEntrada.split(",");
        List<String> grupoM = new ArrayList<>();
        List<String> grupoF = new ArrayList<>();

        for (String nomeESexo : nomesESexos) {
            String[] partes = nomeESexo.split("-");
            String nome = partes[0];
            String sexo = partes[1];

            if ("M".equalsIgnoreCase(sexo)) {
                grupoM.add(nome);
            } else if ("F".equalsIgnoreCase(sexo)) {
                grupoF.add(nome);
            }
        }

        System.out.println("\nGrupo M:");
        for (String nome : grupoM) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo F:");
        for (String nome : grupoF) {
            System.out.println(nome);
        }

        List<String> mulheres = grupoF.stream()
                .collect(Collectors.toList());

        System.out.println("\nLista só com mulheres em lambda e stram:");
        mulheres.forEach(System.out::println);



        read.close();
    }
}
