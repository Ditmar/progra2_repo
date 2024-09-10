package points;

public class Point3d extends Point {
    private Integer z;
    public Point3d(Integer x, Integer y, Integer z) {
        super(x, y);
        this.z = z;
    }
    public Integer getZ() {
        return z;
    }
    public void setZ(Integer z) {
        this.z = z;
    }

    @Override
    public void print() {
        System.out.println(" x = " + this.getX() + " y = " + this.getY() + " z = " + this.z);
    }
}
