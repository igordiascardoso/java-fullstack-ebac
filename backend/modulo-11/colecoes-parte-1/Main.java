import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("Igor");
        listaNomes.add("João");
        listaNomes.add("Karla");
        listaNomes.add("Marcos");
        listaNomes.add("Henrique");
        listaNomes.add("Mona");

        Collections.sort(listaNomes);

        System.out.println(listaNomes);

    }
}