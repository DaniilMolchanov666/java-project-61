package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final int QUESTION = 0;
    private static final int CORRECT_ANSWER = 1;
    public static final int COUNT_OF_ROUNDS = 3;
    private static final Scanner INPUT_SCANNER = new Scanner(System.in);
    private static final String GREETING = "Welcome to the Brain Games!";
    private static final String NAME_REQUEST = "May I have your name? ";
    private static String playerName;
    private static int countOfCorrectAnswers;

    public static void checkResult(String gameTask, String[][] questionAnswerPairs) {

        System.out.println(GREETING + "\n" + NAME_REQUEST);
        setPlayerName(INPUT_SCANNER.next());
        System.out.println("\n" + "Hello, " + getPlayerName() + "!");
        System.out.println();

        System.out.println(gameTask);

        for (int i = 0; i < Engine.COUNT_OF_ROUNDS; i++) {

            String question = questionAnswerPairs[i][Engine.QUESTION];
            String correctAnswer = questionAnswerPairs[i][Engine.CORRECT_ANSWER];

            System.out.println("Question: " + question);
            System.out.println("Your answer: ");

            String answer = INPUT_SCANNER.next();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                countOfCorrectAnswers++;

            } else {
                System.out.print("'" + answer + "'" + " is wrong answer ;(. ");
                System.out.print("Correct  answer was " + "'" + correctAnswer + "'. ");
                System.out.print("Let's try again, " + getPlayerName() + "!");
                break;
            }
        }
        if (countOfCorrectAnswers == COUNT_OF_ROUNDS) {
            System.out.println("Congratulations, " + getPlayerName() + "!");
        }
    }

    private static String getPlayerName() {
        return playerName;
    }

    private static void setPlayerName(String name) {
        playerName = name;
    }
}












