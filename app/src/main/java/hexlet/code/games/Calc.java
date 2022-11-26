package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static void startGame() {

        String[][] gameData = new String[Engine.COUNT_OF_ROUNDS][2];

        for (int i = 0; i < gameData.length; i++) {
            gameData[i] = calc();
        }
        System.out.println(Engine.checkResult(DESCRIPTION, gameData));
    }
    public static String[] calc() {

        Random r = new Random();

        int correct = 0;
        String symbols = "+-*";
        char c = symbols.charAt(r.nextInt(symbols.length()));

        int numberOne = r.nextInt(50);
        int numberTwo = r.nextInt(50);

        if (c == '+') {
            correct = numberOne + numberTwo;
        } else if (c == '-') {
            correct = numberOne - numberTwo;
        } else {
            correct = numberOne * numberTwo;
        }

        String question = "" + numberOne + c + numberTwo;
        String correctAnswer = Integer.toString(correct);

        String[] oneRound = {question, correctAnswer};

        return oneRound;
    }
}
