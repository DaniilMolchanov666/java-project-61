package hexlet.code.games;

import  java.util.Random;
public class Prime {
    public static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static boolean isPrime(int number) {

        int i = 2;

        while (i < Math.ceil((float) number / 2)) {
            if (number % i != 0) {
                i++;
                continue;
            }
            return false;
        }
        return true;
    }
    public static String[] getQAPair() {

        Random rand = new Random();

        int number = rand.nextInt(100 - 1) + 1;

        String question = Integer.toString(number);
        String correctAnswer = isPrime(number) ? "yes" : "no";

        return new String[]{question, correctAnswer};

    }
}

