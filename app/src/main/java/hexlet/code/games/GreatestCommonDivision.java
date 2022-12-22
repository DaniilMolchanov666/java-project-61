package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class GreatestCommonDivision {

    private static final String GCD_GAME_TASK = "Find the greatest common divisor of given numbers.";
    private static final int MIN_BOUND_OF_RANDOM_VALUE = 1;
    private static final int MAX_BOUND_OF_RANDOM_VALUE = 100;
    private static final Random RANDOMIZER = new Random();

    public static void startGCDGame() {

        String[][] gcdGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < gcdGameData.length; i++) {
            gcdGameData[i] = generateAnswerQuestionPair();
        }
        Engine.checkResult(GCD_GAME_TASK, gcdGameData);
    }

    private static String[] generateAnswerQuestionPair() {

        int randomNumberOne = RANDOMIZER.nextInt(MAX_BOUND_OF_RANDOM_VALUE
                - MIN_BOUND_OF_RANDOM_VALUE) + MIN_BOUND_OF_RANDOM_VALUE;

        int randomNumberTwo = RANDOMIZER.nextInt(MAX_BOUND_OF_RANDOM_VALUE
                - MIN_BOUND_OF_RANDOM_VALUE) + MIN_BOUND_OF_RANDOM_VALUE;

        String question = randomNumberOne + " " + randomNumberTwo;
        String correctAnswer = Integer.toString(findGCD(randomNumberOne, randomNumberTwo));

        return new String[]{question, correctAnswer};
    }

    private static int findGCD(int firstNumber, int secondNumber) {

        int correctResult = 1;

        for (int j = Math.min(firstNumber, secondNumber); j >= 2; j--) {
            if (firstNumber % j == 0 && secondNumber % j == 0) {
                correctResult = j;
                break;
            }
        }
        return correctResult;
    }
}
