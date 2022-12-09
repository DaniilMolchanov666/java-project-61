package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Even {
    private static final String EVEN_GAME_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final Random randomValue = new Random();
    public static void startEvenGame() {

        String[][] evenGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < evenGameData.length; i++) {
            evenGameData[i] = generateAnswerQuestionPair();
        }
        System.out.println(Engine.checkResult(EVEN_GAME_TASK, evenGameData));
    }
    private static String[] generateAnswerQuestionPair() {

        int number = randomValue.nextInt(100 - 1) + 1;

        String correctAnswer = isEven(number) ? "yes" : "no";
        String question = Integer.toString(number);

        return new String[]{question, correctAnswer};
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
