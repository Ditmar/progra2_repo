import java.util.ArrayList;

import extension.ArrayData;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayData<Integer, Integer> list = new ArrayData<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(89);
        list.add(3);
        list.add(6);
        list.forEach((item ) -> System.out.println(item));
        ArrayData<Integer, Integer> result = list.map( (Integer item ) -> {
            return 1;
        });
        // ArrayData<Integer, Integer> result = list.filter( (Integer item ) -> {
        //     return item % 2 == 0;
        // });

        result.forEach((item ) -> System.out.println(item));
    }
}
