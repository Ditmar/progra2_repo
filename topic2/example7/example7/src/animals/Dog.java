package animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void eat() {
        System.out.println("El perro come");
    }

    @Override
    public void move() {
        System.out.println("El perro camina");
    }
    
}
