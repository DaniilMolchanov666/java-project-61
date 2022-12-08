package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Even {
    public static final String EVEN_GAME_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void startEvenGame() {

        String[][] evenGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < evenGameData.length; i++) {

            evenGameData[i] = getAnswerQuestionPair();
        }

        System.out.println(Engine.checkResult(EVEN_GAME_TASK, evenGameData));
    }
    public static boolean isEven(int number) {

        return number % 2 == 0;
    }
    public static String[] getAnswerQuestionPair() {

        Random rand = new Random();

        int number = rand.nextInt(100 - 1) + 1;

        String correctAnswer = isEven(number) ? "yes" : "no";
        String question = Integer.toString(number);

        return new String[]{question, correctAnswer};
    }
}
