import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int answer =  least(7, 2);
        System.out.println("Least: " + answer);
    }

    public static int least(int number1, int number2) {
        // write program code here
        int leastNumber;
        if(number1 < number2){
            leastNumber = number1;
        } else if(number1 > number2){
            leastNumber = number2;
        } else{
            leastNumber = number1;
        }
        // method needs a return in the end
        return leastNumber;
    }
}
