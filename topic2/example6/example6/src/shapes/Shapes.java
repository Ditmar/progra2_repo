package shapes;
// es nuestro contrato
public abstract class Shapes {
    private String color;
    public Shapes(String color ) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public abstract Double area();
}
