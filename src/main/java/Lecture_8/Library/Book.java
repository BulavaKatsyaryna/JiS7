package Lecture_8.Library;

public enum Book {
    ROWLING("J. K. Rowling"), BRADLEY("Marion Zimmer Bradley"), ROTHFUSS("Patrick Rothfuss"), CRONIN("Archibald Joseph Cronin");

    private final String typeWriter;

    Book(String usersType) {
        this.typeWriter = usersType;
    }
    public String getTypeWriter() {
        return typeWriter;
    }
}
