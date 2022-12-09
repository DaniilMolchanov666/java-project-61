package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;
public class Progression {
    private static final String PROGRESSION_GAME_TASK = "What number is missing in the progression?";
    private static final Random randomValue = new Random();
    public static void startProgressionGame() {

        String[][] progressionGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < progressionGameData.length; i++) {
            progressionGameData[i] = generateAnswerQuestionPair();
        }
        System.out.println(Engine.checkResult(PROGRESSION_GAME_TASK, progressionGameData));
    }
    private static String[] generateAnswerQuestionPair() {

        int initialNumber = randomValue.nextInt(100);
        int differenceBetweenValues = randomValue.nextInt(100);
        int rowLength = 10;
        String correctAnswer = "";

        int randomPosition = randomValue.nextInt(rowLength - 1);

        String[] ariphmeticProgression = generateProgression(rowLength, differenceBetweenValues, initialNumber);

        for (int i = 0; i < ariphmeticProgression.length; i++) {

            if (i == randomPosition) {
                correctAnswer = ariphmeticProgression[i];
                ariphmeticProgression[i] = "...";
            }
        }

        String question = Arrays.toString(ariphmeticProgression);

        return new String[]{question, correctAnswer};
    }
    private static String[] generateProgression(int progressionLength, int differenceBetweenValues, int initialNumber) {

        String[] progression = new String[progressionLength];

        for (int i = 0; i < progression.length; i++) {

            if (i == 0) {
                progression[i] = Integer.toString(initialNumber);
                continue;
            }
            initialNumber += differenceBetweenValues;
            progression[i] = Integer.toString(initialNumber);
        }
        return progression;
    }
}


