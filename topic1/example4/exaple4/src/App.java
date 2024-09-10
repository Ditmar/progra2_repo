import convert.Ip;

public class App {
    public static void main(String[] args) throws Exception {
        Ip ip = new Ip("192.168.1.1");
        String binaryIp = ip.convertToBinary();
        System.out.println(binaryIp);
    }
}
