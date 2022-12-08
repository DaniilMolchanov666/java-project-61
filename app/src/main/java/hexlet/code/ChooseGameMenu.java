package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GreatestCommonDivision;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;
public class ChooseGameMenu {
    public static void chooseGame() {

        Scanner input_scanner = new Scanner(System.in);

        String select = input_scanner.next();

        switch (select) {
            case "1" -> Greet.greeting();
            case "2" -> {
                Greet.greeting();
                Even.startEvenGame();
            }
            case "3" -> {
                Greet.greeting();
                Calculator.startCalculateGame();
            }
            case "4" -> {
                Greet.greeting();
                GreatestCommonDivision.startGCDGame();
            }
            case "5" -> {
                Greet.greeting();
                Progression.startProgressionGame();
            }
            case "6" -> {
                Greet.greeting();
                Prime.startPrimeGame();
            }
            default -> System.out.println("Incorrect choice. Pls enter number in range 1-6");
        }

        input_scanner.close();
    }
}
