package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Calculator {
    private static final String CALCULATE_GAME_TASK = "What is the result of the expression?";
    private static final String[] MATH_OPERATIONS = {"+", "-", "*"};
    private static final Random randomValue = new Random();
    public static void startCalculateGame() {

        String[][] calculateGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < calculateGameData.length; i++) {
            calculateGameData[i] = generateAnswerQuestionPair();
        }
        System.out.println(Engine.checkResult(CALCULATE_GAME_TASK, calculateGameData));
    }
    private static String[] generateAnswerQuestionPair() {

        int random = randomValue.nextInt(MATH_OPERATIONS.length);

        String mathSign = MATH_OPERATIONS[random];

        int numberOne = randomValue.nextInt(50);
        int numberTwo = randomValue.nextInt(10);

        String question = numberOne + mathSign + numberTwo;
        String correctAnswer = Integer.toString(calculateExpression(numberOne, mathSign, numberTwo));

        return new String[]{question, correctAnswer};
    }
    private static int calculateExpression(int numberOne, String mathOperation, int numberTwo) {

        int correctResult = switch (mathOperation) {
            case "+" -> numberOne + numberTwo;
            case "-" -> numberOne - numberTwo;
            default -> numberOne * numberTwo;
        };
        return correctResult;
    }

}
