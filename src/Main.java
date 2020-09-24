import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Type the password: ");
        String password = input.nextLine();
        while(!password.equals("carrot")){
            System.out.println("Wrong! ");
            System.out.print("Type the password: ");
            password = input.nextLine();
        }
        System.out.println("Right! ");
        System.out.println();
        System.out.print("The secret is: jryy qbar!");
    }
}
