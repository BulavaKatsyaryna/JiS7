package Lecture_8.UniqueWordVocabulary;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

        public Set<String> words = new HashSet<>();

        public void addWord(String word) {
                words.add(word);
        }

        public void getWordsCount() {
                System.out.println("Number of unique words = " + words.size());
        }

        public void printWords() {
                System.out.println("Cities = " + words);
        }
}
