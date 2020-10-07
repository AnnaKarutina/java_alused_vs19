public class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }

    public void withdrawal(double amount){
        this.balance = this.balance - amount; // balance -= amount;
    }

    public double balance(){
        return this.balance;
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
    }

    public void transfer(Account otherAccount, double amount){
        this.withdrawal(amount);
        otherAccount.deposit(amount);
    }
}
