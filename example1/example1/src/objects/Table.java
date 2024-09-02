package objects;
public class Table {
    Integer width;
    Integer height;
    // construct
    public Table(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }
    public Integer area() {
        return this.width * this.height;
    }
    public static void printMessage() {
        System.out.println("Hi i am a static method");
    }
}