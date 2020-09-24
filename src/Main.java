import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(input.nextLine());
        if(number % 2 ==  0){
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
