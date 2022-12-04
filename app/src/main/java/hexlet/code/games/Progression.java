package hexlet.code.games;

import java.util.Arrays;
import java.util.Random;
public class Progression {

    public static final String GAME_TASK = "What number is missing in the progression?";

    public static String[] getQAPair() {

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


