import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
         Account aAccount = new Account("A",100.00);
         Account bAccount = new Account("B",0.00);
         Account cAccount = new Account("C",0.00);

         System.out.println("Initial state");
         System.out.println(aAccount);
         System.out.println(bAccount);
         System.out.println(cAccount);

         transfer(aAccount, bAccount, 50);
         transfer(bAccount, cAccount, 25);

         System.out.println("Final state");
         System.out.println(aAccount);
         System.out.println(bAccount);
         System.out.println(cAccount);

    }

    public static void transfer(Account from, Account to, double amount){
         from.withdrawal(amount);
         to.deposit(amount);
    }

}
