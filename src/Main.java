import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int count = 0;
        while (number != -1) {
            sum += number;
            count++;
            number = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        double average = (double)sum / count;
        System.out.println("Average: " + average);
    }
}
