import read.Reader;
public class App {
    public static void main(String[] args) throws Exception {
         Reader read = new Reader();
         Integer number = read.readInt();
         Double doubleNumber = read.readDouble();
         System.out.println("--> " + number);
         System.out.println("--> " + doubleNumber);
         

    }
}
