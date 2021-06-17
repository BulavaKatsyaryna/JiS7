package Exercises.Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static <E> void addAll(List<E> list, E... array) {
        for (E element : array) {
            list.add(element);
        }
    }

    public static void main(String[] args) {
        addAll(new ArrayList<String>(),
                "Kate",
                "Kolya",
                "Varya",
                "Alisa");
    }
}
