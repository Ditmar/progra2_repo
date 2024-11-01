package poly;

public class Test implements Operations{

    @Override
    public Integer add(Integer a, Integer b) {
        System.out.println("sumar");
        return a + b;
    }

    @Override
    public Integer subtract(Integer a, Integer b) {
        System.out.println("restar");
        return a - b;
    }
    
}
