import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i++;
        }
    }
}
