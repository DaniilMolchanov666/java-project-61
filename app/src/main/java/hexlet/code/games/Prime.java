package hexlet.code.games;

import hexlet.code.Engine;

import  java.util.Random;
public class Prime {
    public static final String PRIME_GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void startPrimeGame() {

        String[][] primeGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < primeGameData.length; i++) {

            primeGameData[i] = getAnswerQuestionPair();
        }

        System.out.println(Engine.checkResult(PRIME_GAME_TASK, primeGameData));
    }
    public static boolean isPrime(int number) {

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
    public static String[] getAnswerQuestionPair() {

        Random rand = new Random();

        int number = rand.nextInt(100 - 1) + 1;

        String question = Integer.toString(number);
        String correctAnswer = isPrime(number) ? "yes" : "no";

        return new String[]{question, correctAnswer};

    }
}

