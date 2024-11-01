import java.util.ArrayList;

import shape.Circle;
import shape.Square;
import shape.Process;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Square square = new Square(45, 4);
        Circle circle = new Circle(67);
        ArrayList<Process> shapes = new ArrayList<>();
        shapes.add(square);
        shapes.add(circle);
        for (Process item : shapes) {
            item.print();
        }

    }
}
