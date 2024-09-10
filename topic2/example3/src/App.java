import math.Vector;
import math.VectorOperation;

public class App {
    public static void main(String[] args) throws Exception {
        VectorOperation operation = new VectorOperation();
        Vector a = new Vector(34, 56);
        Vector b = new Vector(6, 34);
        operation.add();
        Integer result = operation.add(34, 3);
        Vector vectorResult = operation.add(a, b);
        operation.print(result);
        operation.print(vectorResult);
    }
}
