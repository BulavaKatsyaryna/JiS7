package LECTURE_Stream_API_And_Lambdas.Task2;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>(){{
            add("Novogrudok");
            add("Novopolotsk");
            add("Homel");
            add("Novolukoml");
            add("Minsk");
            add("Novobelitsa");
        }};
        listString.stream()
                .filter(it -> it.startsWith("Novo") && it.endsWith("k"))
                .forEach(System.out::println);
    }
}
