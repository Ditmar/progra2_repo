import lottery.Lottery;

public class App {
    public static void main(String[] args) throws Exception {
        Lottery lottery = new Lottery(5, 100, 10);
        lottery.generateRandomNumberList();
        lottery.printList();
    }
}
