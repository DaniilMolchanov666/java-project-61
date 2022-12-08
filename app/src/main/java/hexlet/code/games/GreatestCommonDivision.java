package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GreatestCommonDivision {

    public static final String GCD_GAME_TASK = "Find the greatest common divisor of given numbers.";

    public static void startGCDGame() {

        String[][] gcdGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < gcdGameData.length; i++) {

            gcdGameData[i] = getAnswerQuestionPair();
        }

        System.out.println(Engine.checkResult(GCD_GAME_TASK, gcdGameData));
    }
    public static int findGCD(int numberOne, int numberTwo) {

        int correct = 1;

        for (int j = Math.min(numberOne, numberTwo); j >= 2; j--) {
            if (numberOne % j == 0 && numberTwo % j == 0) {
                correct = j;
                break;
            }
        }
        return correct;
    }

    public static String[] getAnswerQuestionPair() {

        Random rand = new Random();

        int number1 = rand.nextInt(100 - 1) + 1;
        int number2 = rand.nextInt(50 - 1) + 1;

        String question = number1 + " " + number2;
        String correctAnswer = Integer.toString(findGCD(number1, number2));

        return new String[]{question, correctAnswer};

    }
}

