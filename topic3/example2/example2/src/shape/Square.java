package shape;

public class Square implements Process {
    private Integer height;
    private Integer width;
    public Square(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void print() {
        System.out.println("El ancho es : " + this.width + " Y el largo es " + this.height);
    }

    @Override
    public void add(Integer number) {
        this.width += number;
        this.height +=number;
    }
    
}
