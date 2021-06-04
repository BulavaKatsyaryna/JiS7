package LECTURE_Stream_API_And_Lambdas.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        List<Integer> listOfRandomNumbers = new ArrayList<Integer>();
        while (listOfRandomNumbers.size() < 20) {
            int a = randomGenerator.nextInt(100);
            if (!listOfRandomNumbers.contains(a)) {
                listOfRandomNumbers.add(a);
            }
        }

        listOfRandomNumbers.stream()
                .filter(it -> it % 2 == 0)
                .forEach(System.out::println);
        }
    }
