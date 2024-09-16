import bank.*;
public class App {
    public static void main(String[] args) throws Exception {
        //LimitAccount account = new LimitAccount(100.0);
        LimitAccount account = new LimitAccount(3000.00);
        account.add(2000.00);
        account.subtract(100.00);
        account.subtract(150.00);
        account.subtract(200.00);
        account.subtract(50.00);
        account.add(350.00);
        account.printStore();
    }
}
