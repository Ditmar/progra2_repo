package animals;

public class Fish extends Animal{

    public Fish(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void eat() {
        System.out.println("El pez come");
    }

    @Override
    public void move() {
        System.out.println("El pez nada");
    }
    
}
