package bank;

public class Account {
    private Double balance;
    private StoreExtract store;
    public Account(Double balance) {
        this.balance = balance;
        store = new StoreExtract();
    }

    public void add(Double cash) {
        this.balance += cash;
        Logger.print("You are adding " + cash + " bs.");
        //register history
        store.register(cash, "add");
    }

    public void subtract(Double cash) throws Exception {
        if (cash > this.balance) {
            throw new Exception("you don't have enough money");
        }
        this.balance -= cash;
        Logger.print("You are subtracting " + cash + " bs.");
        store.register(cash, "subtract");
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

    public void printStore() {
        this.store.printStore();
    }
    
}
