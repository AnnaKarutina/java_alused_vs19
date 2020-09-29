import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 1;
        int sum = 0;
        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
