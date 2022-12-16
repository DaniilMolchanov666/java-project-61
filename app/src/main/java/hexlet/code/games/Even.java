package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Even {
    private static final String EVEN_GAME_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN_BOUND_OF_RANDOM_VALUE = 1;
    private static final int MAX_BOUND_OF_RANDOM_VALUE = 100;
    private static final String ANSWER_YES = "yes";
    private static final String ANSWER_NO = "no";
    private static final Random RANDOM_NUMBER_GENERATOR = new Random();
    public static void startEvenGame() {

        String[][] evenGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < evenGameData.length; i++) {
            evenGameData[i] = generateAnswerQuestionPair();
        }
        System.out.println(Engine.checkResult(EVEN_GAME_TASK, evenGameData));
    }
    private static String[] generateAnswerQuestionPair() {

        int randomNumber = RANDOM_NUMBER_GENERATOR.nextInt(MAX_BOUND_OF_RANDOM_VALUE - MIN_BOUND_OF_RANDOM_VALUE)
                + MIN_BOUND_OF_RANDOM_VALUE;

        String correctAnswer = isEven(randomNumber) ? ANSWER_YES : ANSWER_NO;
        String question = "Question: " + randomNumber;

        return new String[]{question, correctAnswer};
    }
    private static boolean isEven(int parityCheckedNumber) {
        return parityCheckedNumber % 2 == 0;
    }
}
