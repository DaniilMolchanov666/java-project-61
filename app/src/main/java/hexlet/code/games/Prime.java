package hexlet.code.games;

import hexlet.code.Engine;

import  java.util.Random;
public class Prime {
    private static final String PRIME_GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final Random randomValue = new Random();
    public static void startPrimeGame() {

        String[][] primeGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < primeGameData.length; i++) {

            primeGameData[i] = generateAnswerQuestionPair();
        }
        System.out.println(Engine.checkResult(PRIME_GAME_TASK, primeGameData));
    }
    private static String[] generateAnswerQuestionPair() {

        int number = randomValue.nextInt(100 - 1) + 1;

        String question = Integer.toString(number);
        String correctAnswer = isPrime(number) ? "yes" : "no";

        return new String[]{question, correctAnswer};
    }
    private static boolean isPrime(int number) {

        if (number == 1) {
            return false;
        }

        int i = 2;

        while (i < number) {
            if (number % i != 0) {
                i++;
                continue;
            }
            return false;
        }
        return true;
    }
}

