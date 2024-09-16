package shapes;

public class Triangle extends Shapes {
    private Double width;
    private Double height;
    public Triangle(String color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double area() {
        System.out.println("Soy un triangulo y mi area " + this.width * this.height / 2 );
        return this.width * this.height / 2;
    }
}
