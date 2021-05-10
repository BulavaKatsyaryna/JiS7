package Lecture_8.Library.repository;

import Lecture_8.Library.model.Book;
import Lecture_8.Library.model.Writer;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

public class Library {

    private static ListMultimap<Writer, Book> library = ArrayListMultimap.create();

    public static ListMultimap<Writer, Book> getLibrary() {
        return library;
    }

    public static void setLibrary(ListMultimap<Writer, Book> library) {
        Library.library = library;
    }
}
