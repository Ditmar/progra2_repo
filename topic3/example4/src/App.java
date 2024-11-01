import java.util.ArrayList;

import functional.Test;

public class App {
    public static void main(String[] args) throws Exception {
        Test test = name -> { 
            System.out.println("Hola " + name + " desde la interfaz"); 
        };

        test.greetings("Pablo");
        test.greetings("Pablo1");
        test.greetings("Maria");
        test.greetings("Carlos");
        test.greetings("Pocholo");

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

        list.forEach((String item) -> System.out.println(item));
        list.sort((String a, String b) -> {
            return a.compareTo(b);
        });
        System.out.println("------------------");
        list.forEach((String item) -> System.out.println(item));
        list.sort((a, b) -> {
            return b.compareTo(a);
        });
        
    }
}
