import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        System.out.println(game.average(3, 4));
        game = new GuessingGame();
        System.out.println(game.average(6, 12));
    }
}