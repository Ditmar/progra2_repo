import bank.*;
public class App {
    public static void main(String[] args) throws Exception {
        //LimitAccount account = new LimitAccount(100.0);
        LimitAccount account = new LimitAccount(3000.00);
        account.add(2000.00);
        account.showBalance();
        account.subtract(6900.00);
        account.showBalance();
    }
}
