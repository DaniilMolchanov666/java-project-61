package hexlet.code.games;

import java.util.Random;
public class Calc {

    public static final String GAME_TASK = "What is the result of the expression?";
    private static final String[] MATH_OPERATIONS = {"+", "-", "*"};
    public static String[] getQAPair() {

        Random r = new Random();

        int random = r.nextInt(MATH_OPERATIONS.length);

        String operation = MATH_OPERATIONS[random];

        int correct = 0;
        int numberOne = r.nextInt(50);
        int numberTwo = r.nextInt(50);

        if (operation.equals("+")) {
            correct = numberOne + numberTwo;
        } else if (operation.equals("-")) {
            correct = numberOne - numberTwo;
        } else {
            correct = numberOne * numberTwo;
        }

        String question = numberOne + operation + numberTwo;
        String correctAnswer = Integer.toString(correct);

        return new String[]{question, correctAnswer};
    }

}
