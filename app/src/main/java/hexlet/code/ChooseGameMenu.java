package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;
public class ChooseGameMenu {
    public static void chooseGame() {

        Scanner sc = new Scanner(System.in);
        String select = sc.next();

        switch (select) {
            case "1" -> Cli.greeting();
            case "2" -> {
                Cli.greeting();
                Even.startEvenGame();
            }
            case "3" -> {
                Cli.greeting();
                Calc.startCalculateGame();
            }
            case "4" -> {
                Cli.greeting();
                GCD.startGCDGame();

            }
            case "5" -> {
                Cli.greeting();
                Progression.startProgressionGame();
            }
            case "6" -> {
                Cli.greeting();
                Prime.startPrimeGame();
            }
            default -> System.out.println("Buy! See you later!");
        }
    }
}
