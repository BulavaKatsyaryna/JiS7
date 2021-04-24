package Lecture_8.Library;

public class LibraryDemo {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(Writer.ROWLING, "Harry Potter and the Philosopher's Stone (ROSMAN)");
        library.addBook(Writer.ROWLING, "Harry Potter and the Philosopher's Stone (MACHAON)");
        library.addBook(Writer.ROTHFUSS, "The Name Of The Wind");
        library.addBook(Writer.BRADLEY, "The Mists of Avalon");
        library.addBook(Writer.CRONIN, "The Citadel");
        library.addBook(Writer.CRONIN, "Hatter's Castle");

        library.bookByAuthor();

        library.deletingBook();

        library.titleOfTheBook();
    }
}
