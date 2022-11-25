package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static String checkResult(String[] arrayOfCorrectAnswers, String[] arrayOfQuestions) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayOfCorrectAnswers.length; i++) {

            System.out.println("Question: " + arrayOfQuestions[i]);
            System.out.println("Your answer: ");

            String answer = scanner.next();

            if (!answer.equals(arrayOfCorrectAnswers[i])) {
                return "'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct  answer was " + "'" + arrayOfCorrectAnswers[i] + "'."
                        + "Let's try again, " + Cli.getPlayer() + "!";
            }
            System.out.println("Correct!");
        }
        return "Congratulation! U Win!";
    }
}









