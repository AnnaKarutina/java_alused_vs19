import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
         Account myAccount = new Account("My account",0.00);
         Account mattAccount = new Account("Matt's account",1000.00);

         System.out.println("Initial state");
         System.out.println(myAccount);
         System.out.println(mattAccount);

         transfer(mattAccount, myAccount, 100);

         System.out.println("Final state");
         System.out.println(myAccount);
         System.out.println(mattAccount);
    }

    public static void transfer(Account from, Account to, double amount){
         from.withdrawal(amount);
         to.deposit(amount);
    }

}
