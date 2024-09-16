package bank;

public class LimitAccount extends Account {
    private Double limit;
    public LimitAccount(Double balance) {
        super(balance);
        refreshLimit();
    }
    
    private void refreshLimit() {
        this.limit = super.getBalance() / 2;
    }

    public void add(Double cash) {
        super.add(cash);
        refreshLimit();
    }

    public void subtract(Double cash) {
        try {
            if (this.limit > cash) {
                super.subtract(cash);
            } else {
                Logger.print("The money it you trying to get is to high of your limit ");
            }
            refreshLimit();
        } catch(Exception e) {
            System.out.println("you don't have enough balance");
        }
        
    }
}
