package Lecture_8.UniqueWordCounter;

public class UniqueWordCounterDemo {

    public static void main(String[] args) {

        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();

        uniqueWordCounter.addWord(176542, "Marge Simpson");
        uniqueWordCounter.addWord(208431, "Stan Smith");
        uniqueWordCounter.addWord(385432, "Rick Sanchez");
        uniqueWordCounter.addWord(407126, "Steve Griffin");
        uniqueWordCounter.addWord(208431, "Hayley Smith");

        uniqueWordCounter.printWordsFrequency();

        uniqueWordCounter.size();

        uniqueWordCounter.repeatWords();
    }
}
