package example;

import java.util.ArrayList;

public class Autor {
    private String name;
    private String lastname;
    private ArrayList<Book> books;
    public Autor(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.books = new ArrayList<>();
    }
    public void printBooks() {
        System.out.println("Autor " + this.name);
        books.forEach(book -> {
            book.print();
        });
    }
    public void addBook(Book book) {
        this.books.add(book);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}