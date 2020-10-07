import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
         Account myAccount = new Account("Anna's account",100.00);

         System.out.println("Initial state");
         System.out.println(myAccount);

         myAccount.deposit(20);
         System.out.println("My account balance is now: " + myAccount.balance());

         System.out.println("Final state");
         System.out.println(myAccount);
    }

}
