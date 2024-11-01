import example.Autor;
import example.Book;

public class App {
    public static void main(String[] args) throws Exception {
        Autor autor1 = new Autor("Pablo", "Neruda");
        Autor autor2 = new Autor("Fabiola", "Perez");
        for (Integer i = 0; i < 10; i++) {
            Book book1 = new Book("book autor" + i, 2000 + i);
            Book book2 = new Book("book autor 2" + i, 1992 + i);
            autor1.addBook(book1);
            autor2.addBook(book2);
        }

        autor1.printBooks();
        System.out.println("------------");
        autor2.printBooks();
    }
}
