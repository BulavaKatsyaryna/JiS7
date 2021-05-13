package Lecture_8.Library.service;

import Lecture_8.Library.model.Book;
import Lecture_8.Library.model.Writer;

public interface BookService<Library> {

    void BookAdd(Writer writer, String bookName);

    Book findBookByAuthorName(String authorName);

    void delete(Book book);

    Writer findAuthorByBookName(Book book);
}
