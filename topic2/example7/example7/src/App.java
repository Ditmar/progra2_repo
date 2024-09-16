import java.lang.reflect.Array;
import java.util.ArrayList;

import animals.*;

public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("Sven");
        Bird bird = new Bird("Sazu");
        Fish fish = new Fish("Nemo");
        ArrayList<Animal> list = new ArrayList();
        list.add(dog);
        list.add(fish);
        list.add(bird);
        for (Animal animal : list) {
            animal.eat();
            animal.move();
        }

    }
}
