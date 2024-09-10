import repeat.RepeatNumber;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] numbers = {1,2,1,3,4,5,4,4,5};
        RepeatNumber repeatNumber = new RepeatNumber(numbers);
        Integer[] results = repeatNumber.repeatNumbers();
        for (Integer i = 0 ; i < results.length; i++) {
            System.out.print(results[i] + ",");
        }
    }
}
