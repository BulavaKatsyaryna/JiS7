package LECTURE_Stream_API_And_Lambdas.Task_2;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(){{
            add("Minsk");
            add("Mohilev");
            add("Krichev");
            add("Novopolotsk");
            add("Klichev");
            add("Novolykoml");
            add("Polotsk");
            add("Novohrudok");
            add("Pinsk");
        }
        };
        stringList.stream()
                .filter(it -> it.startsWith("Novo") && it.endsWith("k"))
                .forEach(System.out::println);

    }
}
