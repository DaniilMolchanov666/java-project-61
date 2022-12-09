package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class GreatestCommonDivision {
    private static final String GCD_GAME_TASK = "Find the greatest common divisor of given numbers.";
    private static final Random randomValue = new Random();
    public static void startGCDGame() {

        String[][] gcdGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < gcdGameData.length; i++) {
            gcdGameData[i] = generateAnswerQuestionPair();
        }
        System.out.println(Engine.checkResult(GCD_GAME_TASK, gcdGameData));
    }
    private static String[] generateAnswerQuestionPair() {

        int number1 = randomValue.nextInt(100 - 1) + 1;
        int number2 = randomValue.nextInt(50 - 1) + 1;

        String question = number1 + " " + number2;
        String correctAnswer = Integer.toString(findGCD(number1, number2));

        return new String[]{question, correctAnswer};
    }
    private static int findGCD(int numberOne, int numberTwo) {

        int correctResult = 1;

        for (int j = Math.min(numberOne, numberTwo); j >= 2; j--) {
            if (numberOne % j == 0 && numberTwo % j == 0) {
                correctResult = j;
                break;
            }
        }
        return correctResult;
    }
}

