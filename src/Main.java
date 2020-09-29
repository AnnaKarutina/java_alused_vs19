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
        int guessCount = 1;
        while(number != guess){
            if(number > guess){
                System.out.println("The number is greater, guesses made: " + guessCount);
            } else if(number < guess){
                System.out.println("The number is lesser, guesses made: " + guessCount);
            }
            System.out.println("Guess a number: ");
            guess = Integer.parseInt(input.nextLine());
            guessCount++;
        }
        System.out.println("Congratulations, your guess is correct!");

    }
}
