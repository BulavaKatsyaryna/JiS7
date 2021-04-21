package Lecture_8.UniqueWordVocabulary;

public class UniqueWordVocabularyDemo {

    public static void main(String[] args) {

        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();

        uniqueWordVocabulary.addWord("New York");
        uniqueWordVocabulary.addWord("Washington");
        uniqueWordVocabulary.addWord("Los Angeles");
        uniqueWordVocabulary.addWord("Boston");
        uniqueWordVocabulary.addWord("Washington");

        uniqueWordVocabulary.getWordsCount();

        uniqueWordVocabulary.printWords();
    }
}
