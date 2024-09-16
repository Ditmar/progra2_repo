import shapes.Circle;
import shapes.Triangle;
import shapes.Shapes;

public class App {
    public static void main(String[] args) throws Exception {
        Circle circle = new Circle("verde", 34.4);
        Triangle triangle = new Triangle("red", 20.00, 30.0);
        printShapes(circle);
        printShapes(triangle);
    }
    // polimorfismo
    public static void printShapes(Shapes shape) {
        shape.area();
    }
}
