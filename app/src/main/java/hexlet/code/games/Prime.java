package hexlet.code.games;

import hexlet.code.Engine;
import  java.util.Random;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void startGame() {

        String[][] gameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < gameData.length; i++) {
            gameData[i] = prime();
        }
        System.out.println(Engine.checkResult(DESCRIPTION, gameData));
    }
    public static String[] prime() {

        Random rand = new Random();

        int number = rand.nextInt(100 - 1) + 1;
        int i = 2;
        boolean isPrime = true;
        String correct = "";

        while (i < Math.ceil((float) number / 2)) {
            if (number % i != 0) {
                i++;
                continue;
            }
            isPrime = false;
            break;
        }

        String question = Integer.toString(number);
        String correctAnswer = isPrime ? "yes" : "no";

        String[] oneRound = {question, correctAnswer};

        return oneRound;
    }
}

