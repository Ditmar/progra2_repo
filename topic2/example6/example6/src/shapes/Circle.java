package shapes;

public class Circle extends Shapes {
    private Double radio;
    public Circle(String color, Double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public Double area() {
        System.out.println("Soy un circulo y mi area es = " + Math.PI * Math.pow(this.radio, 2) );
        return Math.PI * Math.pow(this.radio, 2);
    }
    
}
