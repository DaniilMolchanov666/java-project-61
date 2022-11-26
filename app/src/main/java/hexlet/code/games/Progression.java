package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Random;
public class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    public static void startGame() {

        String[][] gameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < gameData.length; i++) {
            gameData[i] = progression();
        }
        System.out.println(Engine.checkResult(DESCRIPTION, gameData));
    }
    public static String[] progression() {

        Random rand = new Random();

        int number1 = rand.nextInt(100);
        int dif = rand.nextInt(100);
        int randomPosition = rand.nextInt(9);
        String correctAnswer = null;

        String[] array = new String[10];

        for (int i = 0; i < array.length; i++) {

            if (i == randomPosition) {

                array[i] = "...";
                number1 += dif;
                correctAnswer = Integer.toString(number1);

            } else if (i == 0) {

                array[i] = Integer.toString(number1);

            } else {

                number1 += dif;
                array[i] = Integer.toString(number1);
            }
        }

        String question = Arrays.toString(array);

        String[] oneRound = {question, correctAnswer};
        return oneRound;
    }
}


