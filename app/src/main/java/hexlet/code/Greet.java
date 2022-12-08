package hexlet.code;
import java.util.Scanner;

public class Greet {
    private static String playerName;
    public static void setPlayer(String name) {
        playerName = name;
    }
    public static String getPlayer() {
        return playerName;
    }
    public static void greeting() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setPlayer(sc.next());
        System.out.println("\n" + "Hello, " + getPlayer() + "!");
        System.out.println();
    }
}
