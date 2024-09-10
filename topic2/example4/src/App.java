import points.Point;
import points.Point3d;

public class App {
    public static void main(String[] args) throws Exception {
        Point point = new Point(4, 5);
        point.print();
        Point3d point3d = new Point3d(3, 5, 2);
        point3d.print();
    }
}
