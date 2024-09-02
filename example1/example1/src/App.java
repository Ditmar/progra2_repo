import objects.Table;

public class App {
    public static void main(String[] args) throws Exception {
        Table table = new Table(30, 40);
        Table anotherTable  = new Table(10, 10);
        Integer area = table.area();
        Integer area2 = anotherTable.area();
        System.out.println(area);
        System.out.println(area2);
        Table.printMessage();
        
    }
}
