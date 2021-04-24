package Lecture_8.Library;

public enum Writer {
    ROWLING("J. K. Rowling"), BRADLEY("Marion Zimmer Bradley"), ROTHFUSS("Patrick Rothfuss"), CRONIN("Archibald Joseph Cronin");

    private final String typeWriter;

    Writer(String writersType) {
        this.typeWriter = writersType;
    }
    public String getTypeWriter() {
        return typeWriter;
    }
}
