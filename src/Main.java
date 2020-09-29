import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        drawNumber();
    }
    private static void drawNumber(){
        int number = (int)(Math.random()*101);
        System.out.println(number);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number: ");
        int guess = Integer.parseInt(input.nextLine());
        while(number != guess){
            if(number > guess){
                System.out.println("The number is greater");
            } else if(number < guess){
                System.out.println("The number is lesser");
            }
            System.out.println("Guess a number: ");
            guess = Integer.parseInt(input.nextLine());
        }
        System.out.println("Congratulations, your guess is correct!");

    }
}
