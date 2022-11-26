package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
public class GCD {

    public static String createQuestion() {

    }

    public static void gcd() {

        Random rand = new Random();

        System.out.println("Find the greatest common divisor of given numbers.");

        String[] arrayOfCorrectAnswers = new String[3];
        String[] arrayOfQuestions = new String[3];

        for (int i = 0; i < arrayOfCorrectAnswers.length; i++) {

            int number1 = rand.nextInt(100);
            int number2 = rand.nextInt(100);

            arrayOfQuestions[i] = number1 + " " + number2;

            int correct = 1;

            for (int j = Math.min(number1, number2); j >= 2; j++) {
                if (number1 % j == 0 && number2 % j == 0) {
                    correct = j;
                    break;
                }
            }
            arrayOfCorrectAnswers[i] = Integer.toString(correct);
        }
        System.out.println(Engine.checkResult(arrayOfCorrectAnswers, arrayOfQuestions));
    }
}
