package hexlet.code.games;

import java.util.Random;
public class Even {

    public static final String GAME_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static boolean isEven(int number) {

        return number % 2 == 0;
    }
    public static String[] getQAPair() {

        Random rand = new Random();

        int number = rand.nextInt(100 - 1) + 1;

        String correctAnswer = isEven(number) ? "yes" : "no";

        String question = Integer.toString(number);

        return new String[]{question, correctAnswer};
    }
}
