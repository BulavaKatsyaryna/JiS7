package Lecture_8.Library;

import Lecture_8.Library.model.Book;
import Lecture_8.Library.model.Writer;
import Lecture_8.Library.service.BookService;
import Lecture_8.Library.service.LibraryService;

public class LibraryDemo {
    public static void main(String[] args) {

        LibraryService libraryService = new LibraryService();

        libraryService.BookAdd(Writer.ROWLING, "Harry Potter and the Philosopher's Stone (ROSMAN)");

    }
}
