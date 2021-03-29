package ua.com.prologistic;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;


class ArraysHW2{

    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Метод [5] заполненный целочисленные значения: " + Arrays.toString(array));

        if (ArrayUtils.contains(array, 0)) {
            System.out.println("Проверка на заполненность массива: " + "Массив не заполнен");
        } else array = Arrays.copyOf(array, array.length * 3 / 2);
        System.out.println("Увеличенный на 50% массив: " + Arrays.toString(array));

    }

}