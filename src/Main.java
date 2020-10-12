import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person david = new Person("David", 31, 8, 2010);
        Person jeva = new Person("Jeva", 1, 8, 2014);

        System.out.println( david.getName() + " age " + david.age() + " years");
        System.out.println( jeva.getName() + " age " + jeva.age() + " years");
    }
}
