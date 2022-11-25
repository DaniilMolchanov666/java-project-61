package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet" + "\n" + "2 - Even" + "\n" + "3 - Calc"
                + "\n" + "4 - GCD" + "\n" + "5 - Progression" + "\n" + "6 - Prime" + "\n" + "0 - Exit"
                + "\n" + "Your choice: ");

        int select = sc.nextInt();

        Cli.greeting();

        switch (select) {

            case 1:

                Cli.greeting();
                break;

            case 2:

                Even.gameTwo();
                break;

            case 3:

                Calc.calc();
                break;

            case 4:

                GCD.gcd();
                break;

            case 5:

                Progression.progression();
                break;

            case 6:

                Prime.prime();
                break;

            default:

                System.out.println("Buy! See you later!");
                break;

        }

    }
}
