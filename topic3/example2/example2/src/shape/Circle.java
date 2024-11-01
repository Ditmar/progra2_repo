package shape;

public class Circle implements Process{
    private Integer radio;
    public Circle(Integer radio) {
        this.radio = radio;
    }
    @Override
    public void print() {
        System.out.println("El radio del circulo es " + this.radio);
    }

    @Override
    public void add(Integer number) {
        this.radio += number;
    }
    
}
