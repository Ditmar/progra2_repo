package math;

public class VectorOperation extends BaseOperation{
    private Vector result;
    public Vector add(Vector a, Vector b) {
        Integer resultX = a.getX() + b.getX();
        Integer resultY = a.getY() + b.getY();
        result = new Vector(resultX, resultY);
        return result;
    }
    // no sense function, it is only and example to show you how the overflow is working
    public void add () {
        System.out.println("hello, i am an example");
    }
    public void print (Vector result) {
        System.out.println("Result  x="  + result.getX() + " y = " + result.getY());
    }    

}
