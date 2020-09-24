import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number: ");
        int numberOne = Integer.parseInt(input.nextLine());
        System.out.print("Type another number: ");
        int numberTwo = Integer.parseInt(input.nextLine());
        double division = (double)numberOne / numberTwo;
        System.out.println("Division: " + numberOne + " / " + numberTwo + " = " + division);
    }
}
