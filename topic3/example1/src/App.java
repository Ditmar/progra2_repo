import poly.Operations;
import poly.Test;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Test operations = new Test();
        polimorfismo(operations);
    }
    public static void polimorfismo(Operations object) {
        object.add(3, 4);
        object.subtract(6, 3);
    }
}