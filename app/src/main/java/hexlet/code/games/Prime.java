package hexlet.code.games;

import hexlet.code.Engine;

import  java.util.Random;
public class Prime {

    private static final String PRIME_GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_BOUND_OF_RANDOM_VALUE = 1;
    private static final int MAX_BOUND_OF_RANDOM_VALUE = 100;
    private static final String ANSWER_YES = "yes";
    private static final String ANSWER_NO = "no";
    private static final Random RANDOMIZER = new Random();

    public static void startPrimeGame() {

        String[][] primeGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < primeGameData.length; i++) {

            primeGameData[i] = generateAnswerQuestionPair();
        }
        Engine.checkResult(PRIME_GAME_TASK, primeGameData);
    }

    private static String[] generateAnswerQuestionPair() {

        int randomNumber = RANDOMIZER.nextInt(MAX_BOUND_OF_RANDOM_VALUE - MIN_BOUND_OF_RANDOM_VALUE)
                + MIN_BOUND_OF_RANDOM_VALUE;

        String question = Integer.toString(randomNumber);

        String correctAnswer = isPrime(randomNumber) ? ANSWER_YES : ANSWER_NO;

        return new String[]{question, correctAnswer};
    }

    private static boolean isPrime(int primeCheckedNumber) {

        if (primeCheckedNumber == 1) {
            return false;
        }

        int i = 2;

        while (i < primeCheckedNumber) {
            if (primeCheckedNumber % i != 0) {
                i++;
                continue;
            }
            return false;
        }
        return true;
    }
}

