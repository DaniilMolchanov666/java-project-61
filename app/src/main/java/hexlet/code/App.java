package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GreatestCommonDivision;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final Scanner INPUT_SCANNER = new Scanner(System.in);
    private static void chooseGame() {

        String selectGame = INPUT_SCANNER.next();

        switch (selectGame) {
            case "1" -> CLI.greeting();
            case "2" -> {
                CLI.greeting();
                Even.startEvenGame();
            }
            case "3" -> {
                CLI.greeting();
                Calculator.startCalculateGame();
            }
            case "4" -> {
                CLI.greeting();
                GreatestCommonDivision.startGCDGame();
            }
            case "5" -> {
                CLI.greeting();
                Progression.startProgressionGame();
            }
            case "6" -> {
                CLI.greeting();
                Prime.startPrimeGame();
            }
            case "0" -> {
                System.out.println("Goodbye! See you later!");
            }
            default -> System.out.println("Incorrect choice. Please, enter number in range 1-6");
        }

        INPUT_SCANNER.close();
    }

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet" + "\n" + "2 - Even" + "\n" + "3 - Calculator"
                + "\n" + "4 - GreatestCommonDivision" + "\n" + "5 - Progression" + "\n" + "6 - Prime"
                + "\n" + "0 - Exit"
                + "\n" + "Your choice: ");

        chooseGame();
    }
}
