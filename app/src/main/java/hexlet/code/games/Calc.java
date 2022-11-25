package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    public static void calc() {

        Random r = new Random();

        System.out.println("What is the result of the expression?");

        String[] arrayOfCorrectAnswers = new String[3];
        String[] arrayOfQuestions = new String[3];

        for (int i = 0; i < arrayOfCorrectAnswers.length; i++) {

            int correct = 0;
            String symbols = "+-*";
            char c = symbols.charAt(r.nextInt(symbols.length()));

            int numberOne = r.nextInt(100);
            int numberTwo = r.nextInt(100);

            if (c == '+') {
                correct = numberOne + numberTwo;
            } else if (c == '-') {
                correct = numberOne - numberTwo;
            } else {
                correct = numberOne * numberTwo;
            }

            arrayOfCorrectAnswers[i] = "" + correct;
            arrayOfQuestions[i] = "" + numberOne + c + numberTwo;
        }

        System.out.println(Engine.checkResult(arrayOfCorrectAnswers, arrayOfQuestions));
    }
}
