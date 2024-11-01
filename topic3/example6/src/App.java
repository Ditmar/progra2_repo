import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        Predicate<String> pr = item -> item.length() > 10; 

        if (pr.test("hola")) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }

        Function <String, Integer> fr = (String item ) -> Integer.parseInt(item);
        Integer result = fr.apply("10");
        System.out.println(result);

        ArrayList<String> list = new ArrayList<>();
        list.add("Gomez");
        list.add("Florero");
        list.add("Fabiola");
        list.add("Chavo");
        list.add("Goku");
        list.add("Maria");
        list.add("Carlos");
        list.add("Pocholo");
        list.add("Antonio");
        list.forEach(item -> System.out.println(item));
        list.removeIf( item -> item.equals("Chavo"));
        System.out.println("-------------------------");
        list.forEach(item -> System.out.println(item));
    }
}
