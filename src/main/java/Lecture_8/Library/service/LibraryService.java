package Lecture_8.Library.service;

import Lecture_8.Library.model.Book;
import Lecture_8.Library.model.Writer;
import Lecture_8.Library.repository.Library;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

public class LibraryService implements BookService<Library> {
    private static ListMultimap<Writer, Book> library = ArrayListMultimap.create();

//    Library library = new Library();

    @Override
    public void BookAdd(Writer writer, String bookName) {
        library.put(writer, bookName);
        System.out.println(Library.library);
    }

    @Override
    public Book findBookByAuthorName(String authorName) {
        return null;
    }

    @Override
    public void delete(Book book) {
    }

    @Override
    public Writer findAuthorByBookName(Book book) {
        return null;
    }
}
