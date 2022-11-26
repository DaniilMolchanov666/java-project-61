package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class GCD {

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static void startGame() {

        String[][] gameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < gameData.length; i++) {
            gameData[i] = gcd();
        }
        System.out.println(Engine.checkResult(DESCRIPTION, gameData));
    }
    public static String[] gcd() {

        Random rand = new Random();

        int number1 = rand.nextInt(100 - 1) + 1;
        int number2 = rand.nextInt(50 - 1) + 1;

        int correct = 1;

        for (int j = Math.min(number1, number2); j >= 2; j--) {
            if (number1 % j == 0 && number2 % j == 0) {
                correct = j;
                break;
            }
        }

        String question = number1 + " " + number2;
        String correctAnswer = Integer.toString(correct);

        String[] oneRound = {question, correctAnswer};

        return oneRound;
    }
}

