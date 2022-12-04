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
                System.out.println(Engine.checkResult(Even.GAME_TASK,
                        Engine.getGameData(Even.getQAPair(), Even.getQAPair(), Even.getQAPair())));
            }
            case "3" -> {
                Cli.greeting();
                System.out.println(Engine.checkResult(Calc.GAME_TASK,
                        Engine.getGameData(Calc.getQAPair(), Calc.getQAPair(), Calc.getQAPair())));
            }
            case "4" -> {
                Cli.greeting();
                System.out.println(Engine.checkResult(GCD.GAME_TASK,
                        Engine.getGameData(GCD.getQAPair(), GCD.getQAPair(), GCD.getQAPair())));
            }
            case "5" -> {
                Cli.greeting();
                System.out.println(Engine.checkResult(Progression.GAME_TASK,
                        Engine.getGameData(Progression.getQAPair(),
                                Progression.getQAPair(), Progression.getQAPair())));
            }
            case "6" -> {
                Cli.greeting();
                System.out.println(Engine.checkResult(Prime.GAME_TASK,
                        Engine.getGameData(Prime.getQAPair(), Prime.getQAPair(), Prime.getQAPair())));
            }
            default -> System.out.println("Buy! See you later!");
        }
    }
}
