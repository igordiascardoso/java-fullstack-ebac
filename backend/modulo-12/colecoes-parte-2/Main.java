import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Insira: ");

        String leitura1 = read.nextLine();

        String[] vetLeitura1 = leitura1.split(",");

        List<String> listaLeitura1 = Arrays.asList(vetLeitura1);

        Collections.sort(listaLeitura1);

        System.out.println(listaLeitura1);

        System.out.println("Insira seu nome e sexo: (Exemplo: Igor-M) ");

        String leitura2 = read.nextLine();

        String[] vetLeitura2 = leitura2.split(",");

        List<String> grupoM = new ArrayList<>();
        List<String> grupoF = new ArrayList<>();

        for (String nomeSexo : vetLeitura2) {
            String[] partes = nomeSexo.split("-");
            if (partes.length == 2) {
                if ("M".equalsIgnoreCase(partes[1])) {
                    grupoM.add(partes[0]);
                } else if ("F".equalsIgnoreCase(partes[1])) {
                    grupoF.add(partes[0]);
                }
            }
        }
        System.out.println("");
        System.out.println("Grupo M:");
        for (String nome : grupoM) {
            System.out.println(nome);
        }

        System.out.println("");
        System.out.println("Grupo F:");
        for (String nome : grupoF) {
            System.out.println(nome);
        }

        read.close();
    }
}
