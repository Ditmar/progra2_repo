package math;

public class BaseOperation {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }
    public Integer division (Integer a, Integer b) {
        if (b == 0) {
            return -1;
        }
        
        return a / b;
    }
    public Integer multiply (Integer a, Integer b) {
        return a * b;
    }
    public void print(Integer result) {
        System.out.println("Result = " + result);
    }
}
