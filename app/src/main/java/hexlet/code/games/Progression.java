package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;
public class Progression {

    public static final String PROGRESSION_GAME_TASK = "What number is missing in the progression?";

    public static void startProgressionGame() {

        String[][] progressionGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < progressionGameData.length; i++) {

            progressionGameData[i] = getAnswerQuestionPair();
        }

        System.out.println(Engine.checkResult(PROGRESSION_GAME_TASK, progressionGameData));
    }

    public static String[] getAnswerQuestionPair() {

        Random rand = new Random();

        int number1 = rand.nextInt(100);
        int dif = rand.nextInt(100);
        int randomPosition = rand.nextInt(9);
        String correctAnswer = null;

        String[] progression = new String[10];

        for (int i = 0; i < progression.length; i++) {

            if (i == randomPosition) {

                progression[i] = "...";
                number1 += dif;
                correctAnswer = Integer.toString(number1);

            } else if (i == 0) {

                progression[i] = Integer.toString(number1);

            } else {

                number1 += dif;
                progression[i] = Integer.toString(number1);
            }
        }

        String question = Arrays.toString(progression);

        return new String[]{question, correctAnswer};
    }
}


