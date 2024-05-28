import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testListaSoComMulheres() {
        // Lista de entrada com nomes e sexos
        List<String> pessoas = Arrays.asList("Ana-F", "João-M", "Maria-F", "Pedro-M", "Sofia-F", "Carlos-M", "Laura-F", "André-M", "Juliana-F", "Lucas-M");

        // Obtendo a lista de mulheres diretamente no teste
        List<String> mulheres = obterListaDeMulheres(pessoas);

        // Verificando se todos os elementos da lista de mulheres terminam com "-F"
        for (String mulher : mulheres) {
            assertTrue("A lista contém elementos que não são mulheres: " + mulher, mulher.endsWith("-F"));
        }
    }

    // Método para obter lista de mulheres
    private List<String> obterListaDeMulheres(List<String> pessoas) {
        List<String> mulheres = new ArrayList<>();
        for (String pessoa : pessoas) {
            String[] partes = pessoa.split("-");
            if (partes[1].equalsIgnoreCase("F")) {
                mulheres.add(partes[0]);
            }
        }
        return mulheres;
    }

}