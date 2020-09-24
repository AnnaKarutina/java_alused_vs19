import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = Integer.parseInt(input.nextLine());
        if(age >= 0 && age <= 120 ){
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
