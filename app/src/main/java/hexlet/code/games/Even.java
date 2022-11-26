package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void startGame() {

        String[][] gameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < gameData.length; i++) {
            gameData[i] = even();
        }
        System.out.println(Engine.checkResult(DESCRIPTION, gameData));
    }

    public static String[] even() {

        Random rand = new Random();

        int number = rand.nextInt(100 - 1) + 1;

        String correctAnswer = "";

        if (number % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }

        String question = Integer.toString(number);

        String[] oneRound = {question, correctAnswer};

        return oneRound;
    }
}
