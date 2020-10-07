public class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }

    public void withdrawal(double amount){
        balance = balance - amount; // balance -= amount;
    }

    public double balance(){
        return balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void transfer(Account to, double amount){
        withdrawal(amount);
        to.deposit(amount);
    }
}
