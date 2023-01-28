public class AccountBalance {

    private String name;
    private double balance;

    public AccountBalance(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setBalance(double balance) {
        if (balance > 0.0) {
            this.balance += balance;
        }
    }

    public double getBalance() {
        return this.balance;
    }

}
