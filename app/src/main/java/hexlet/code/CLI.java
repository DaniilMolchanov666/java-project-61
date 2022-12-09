package hexlet.code;

import java.util.Scanner;
public class CLI {
    private static String playerName;
    private static final Scanner scanner = new Scanner(System.in);
    public static void setPlayer(String name) {
        playerName = name;
    }
    public static String getPlayer() {
        return playerName;
    }
    public static void greeting() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setPlayer(scanner.next());
        System.out.println("\n" + "Hello, " + getPlayer() + "!");
        System.out.println();
    }
}
