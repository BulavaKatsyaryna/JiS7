package Lecture_8.UniqueWordCounter;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {


    public Map<Integer, String> words = new HashMap<>();

    Integer key;
    public void addWord(Integer key, String word) {
        this.key = key;
        words.put(key, word);
    }

    public void size() {
        words.size();
        System.out.println("Number of key/value pairs in the array: " + words.size());
    }

    public void printWordsFrequency() {
        for (Map.Entry<Integer, String> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
    public void repeatWords() {
        int count = 0;
        for (int value : words.keySet()) {
            if (value > 2) {
                count++;
            }
        }
        System.out.println("The key that was added most often: " + key);
    }
}


