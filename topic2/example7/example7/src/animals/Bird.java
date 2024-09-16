package animals;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void eat() {
        System.out.println("El pajaro come");
    }

    @Override
    public void move() {
        System.out.println("El pajaro vuela");
    }
    
}
