package example;

public class Book {
    private String name;
    private Integer year;
    private String code;
    private Double price;
    public Book(String name, Integer year) {
        this.name = name;
        this.year = year;
    }
    public void print() {
        System.out.println("Name of the book " + this.name);
        System.out.println("Publish year " + this.year);
    }

}
