package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Calculator {
    private static final String CALCULATE_GAME_TASK = "What is the result of the expression?";
    private static final String[] MATH_OPERATIONS = {"+", "-", "*"};
    private static final int BOUND_OF_RANDOM_VALUES = 50;
    private static final Random RANDOM_VALUE = new Random();
    public static void startCalculateGame() {

        String[][] calculateGameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < calculateGameData.length; i++) {
            calculateGameData[i] = generateAnswerQuestionPair();
        }
        System.out.println(Engine.checkResult(CALCULATE_GAME_TASK, calculateGameData));
    }
    private static String[] generateAnswerQuestionPair() {

        int randomOperation = RANDOM_VALUE.nextInt(MATH_OPERATIONS.length);

        String randomMathSign = MATH_OPERATIONS[randomOperation];

        int randomNumberOne = RANDOM_VALUE.nextInt(BOUND_OF_RANDOM_VALUES);
        int randomNumberTwo = RANDOM_VALUE.nextInt(BOUND_OF_RANDOM_VALUES);

        String question = randomNumberOne + " " + randomMathSign + " " + randomNumberTwo;
        String correctAnswer = Integer.toString(calculateExpression(randomNumberOne, randomMathSign, randomNumberTwo));

        return new String[]{question, correctAnswer};
    }
    private static int calculateExpression(int numberOne, String mathOperation, int numberTwo) {

        int correctResult = switch (mathOperation) {
            case "+" -> numberOne + numberTwo;
            case "-" -> numberOne - numberTwo;
            case "*" -> numberOne * numberTwo;
            default -> throw new StringIndexOutOfBoundsException("incorrect");
        };
        return correctResult;
    }

}
