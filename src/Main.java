import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        printStars(5);
        printStars(3);
        printStars(9);
    }
    private static void printStars(int amount) {
        int i = 0;
        while(i < amount){
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
}
