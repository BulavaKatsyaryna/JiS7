package Lecture_2.Arrays.src.main.java.ua.com.prologistic;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
//**********@Checked***************//
class ArraysHW {
    public static void main(String[] args) {

        int[] myArrays = {54, 93, 11, 83, 21};
        System.out.println("Массив с рандомными числами: " + Arrays.toString(myArrays));
        
        Arrays.sort(myArrays, 0, 5);
        System.out.println("Сортировка массива от меньшего к большему: "+ Arrays.toString(myArrays));
        
        int[] myArraysCopy = Arrays.copyOf(myArrays, myArrays.length);
        ArrayUtils.reverse(myArraysCopy);
        System.out.println("Создана копия метода с реверсом значений: " + Arrays.toString(myArraysCopy));
        
        int[] combinedIntArray = ArrayUtils.addAll(myArrays, myArraysCopy);
        System.out.println("Объединение двух массивов: " + Arrays.toString(combinedIntArray));
    }

    private static void sort(int[] myArrays, int i, int i1) {
    }
    private static int toString(int[] myArrays) {
        return 0;
    }
}
