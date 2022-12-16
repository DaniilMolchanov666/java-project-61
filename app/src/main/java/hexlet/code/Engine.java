package hexlet.code;

import java.util.Scanner;
public class Engine {
    private static final int QUESTION = 0;
    private static final int CORRECT_ANSWER = 1;
    public static final int COUNT_OF_ROUNDS = 3;
    private static final Scanner INPUT_SCANNER = new Scanner(System.in);
    public static String checkResult(String gameTask, String[][] questionAnswerPairs) {

        System.out.println(gameTask);

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {

            String question = questionAnswerPairs[i][Engine.QUESTION];
            String correctAnswer = questionAnswerPairs[i][Engine.CORRECT_ANSWER];

            System.out.println("Question: " + question);
            System.out.println("Your answer: ");

            String answer = INPUT_SCANNER.next();

            if (!answer.equals(correctAnswer)) {
                return "'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct  answer was " + "'" + correctAnswer + "'."
                        + "Let's try again, " + CLI.getPlayer() + "!";
            }
            System.out.println("Correct!");
        }
        return "Congratulation! U Win!";
    }
}












