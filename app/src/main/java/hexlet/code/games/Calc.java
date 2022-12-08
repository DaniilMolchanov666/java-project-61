package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Calc {

    public static final String CALCULATE_GAME_TASK = "What is the result of the expression?";
    private static final String[] MATH_OPERATIONS = {"+", "-", "*"};

    public static void startCalculateGame() {

        String[][] calculateGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < calculateGameData.length; i++) {

            calculateGameData[i] = getAnswerQuestionPair();
        }

        System.out.println(Engine.checkResult(CALCULATE_GAME_TASK, calculateGameData));
    }

    public static String[] getAnswerQuestionPair() {

        Random r = new Random();

        int random = r.nextInt(MATH_OPERATIONS.length);

        String operation = MATH_OPERATIONS[random];

        int correct = 0;
        int numberOne = r.nextInt(50);
        int numberTwo = r.nextInt(10);

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
