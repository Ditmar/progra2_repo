package bank;

public class Account {
    private Double balance;

    public Account(Double balance) {
        this.balance = balance;
    }

    public void add(Double cash) {
        this.balance += cash;
        Logger.print("You are adding " + cash + " bs.");
    }

    public void subtract(Double cash) throws Exception {
        if (cash > this.balance) {
            throw new Exception("you don't have enough money");
        }
        this.balance -= cash;
        Logger.print("You are subtracting " + cash + " bs.");
    }

    public void showBalance() {
        System.out.println("your balance is " + this.balance);
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
}
