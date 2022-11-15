package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Cli {


    public static String greeting() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = sc.next();
        System.out.println("\n" + "Hello, " + name + "!");
        System.out.println();

        return name;

    }
}