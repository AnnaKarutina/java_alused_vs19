import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println();
        printSquare(4);
    }
    private static void printStars(int amount) {
        int i = 0;
        while(i < amount){
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
    private static void printSquare(int sideSize){
        int i = 0;
        while(i < sideSize) {
            int j = 0;
            while (j < sideSize) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
