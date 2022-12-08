package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static final int QUESTION = 0;
    public static final int CORRECT_ANSWER = 1;
    public static final int COUNT_OF_ROUNDS = 3;
    public static String checkResult(String gameTask, String[][] questionAnswerPairs) {

        System.out.println(gameTask);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {

            String question = questionAnswerPairs[i][Engine.QUESTION];
            String correctAnswer = questionAnswerPairs[i][Engine.CORRECT_ANSWER];

            System.out.println("Question: " + question);
            System.out.println("Your answer: ");

            String answer = scanner.next();

            if (!answer.equals(correctAnswer)) {
                return "'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct  answer was " + "'" + correctAnswer + "'."
                        + "Let's try again, " + Cli.getPlayer() + "!";
            }
            System.out.println("Correct!");
        }
        return "Congratulation! U Win!";
    }
}












