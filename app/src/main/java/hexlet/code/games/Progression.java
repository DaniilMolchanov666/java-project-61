package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {

    private static final String PROGRESSION_GAME_TASK = "What number is missing in the progression?";
    private static final int MIN_BOUND_OF_RANDOM_VALUE = 1;
    private static final int MAX_BOUND_OF_RANDOM_VALUE = 100;
    private static final int PROGRESSION_LENGTH =  10;
    private static final Random RANDOMIZER = new Random();
    private static StringBuilder question = new StringBuilder();

    public static void startProgressionGame() {

        String[][] progressionGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < progressionGameData.length; i++) {
            progressionGameData[i] = generateAnswerQuestionPair();
        }
        Engine.checkResult(PROGRESSION_GAME_TASK, progressionGameData);
    }

    private static String[] generateAnswerQuestionPair() {

        int initialNumber = RANDOMIZER.nextInt(MAX_BOUND_OF_RANDOM_VALUE);
        int differenceBetweenValues = RANDOMIZER.nextInt(MAX_BOUND_OF_RANDOM_VALUE);
        String correctAnswer = "";
        int randomPosition = RANDOMIZER.nextInt(PROGRESSION_LENGTH - MIN_BOUND_OF_RANDOM_VALUE)
                + MIN_BOUND_OF_RANDOM_VALUE;

        int[] progressionOfNumbers = generateProgression(PROGRESSION_LENGTH, differenceBetweenValues, initialNumber);

        String[] progressionWithMissingNumber = new String[PROGRESSION_LENGTH];

        for (int i = 0; i < progressionWithMissingNumber.length; i++) {

            if (i == randomPosition) {
                correctAnswer = String.valueOf(progressionOfNumbers[i]);
                question.append(" .. ");
            } else {
                question.append(" ").append(String.valueOf(progressionOfNumbers[i])).append(" ");
            }
        }
        return new String[]{question.toString(), correctAnswer};
    }

    private static int[] generateProgression(int progressionLength, int differenceBetweenValues, int initialNumber) {

        int[] progression = new int[progressionLength];

        for (int i = 0; i < progression.length; i++) {
            if (i == 0) {
                progression[i] = initialNumber;
                continue;
            }
            initialNumber += differenceBetweenValues;
            progression[i] = initialNumber;
        }
        return progression;
    }
}


