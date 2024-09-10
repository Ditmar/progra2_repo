package points;

public class Point {
    private Integer x;
    private Integer y;
    public Point (Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    public Integer getX() {
        return x;
    }
    public void setX(Integer x) {
        this.x = x;
    }
    public Integer getY() {
        return y;
    }
    public void setY(Integer y) {
        this.y = y;
    }
    public void print() {
        System.out.println(" x = " + this.x + " y = " + this.y);
    }
    
}
