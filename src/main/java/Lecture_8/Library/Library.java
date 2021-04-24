package Lecture_8.Library;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import java.util.*;

public class Library {

    ListMultimap<Writer, String> library = ArrayListMultimap.create();

    String name;

    public void addBook(Writer writer, String name) {
        this.name = name;
        library.put(writer, name);
    }

    public void bookByAuthor() {
        List<String> bookByAuthor = library.get(Writer.CRONIN);
        System.out.println("Book by author Archibald Joseph Cronin: " + bookByAuthor);
    }

    public void deletingBook() {
        library.remove(Writer.ROWLING, "Harry Potter and the Philosopher's Stone (MACHAON)");
        System.out.println("library = " + library);
    }

    public void titleOfTheBook() {
        for (Map.Entry<Writer, String> entry : library.entries()) {
            if (entry.getValue().equals("The Mists of Avalon")) {
                System.out.println("The Mists of Avalon, wrote: " + entry.getKey());
            }
        }
    }
}
