public class BookDemo {

    public static void main(String[] args) {
        Book book1 = new Book("Гарри Поттер и философский камень", "Джоан Роулинг", 432);
        Book book2 = new Book("Гарри Поттер и тайная комната", "Джоан Роулинг", 480);
        Book book3 = new Book("Гарри Поттер и философский камень", "Джоан Роулинг", 432);

        System.out.println("book1 == book1 = " + (book1 == book1));
        System.out.println("book1 == book2 =  " + (book1 == book2));
        System.out.println("book1 == book3 = " + (book1 == book3));

        System.out.println("book1.equals(book1) = " + book1.equals(book1));
        System.out.println("book1.equals(book2) = " + book1.equals(book2));
        System.out.println("book1.equals(book3) = " + book1.equals(book3));
    }
}
