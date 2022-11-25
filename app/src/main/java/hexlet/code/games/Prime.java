package hexlet.code.games;

import      java.util.Random;
import java.util.Scanner;

public class Prime {

    public static void prime() {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int countOfCorrectAnswer = 0;

        while (countOfCorrectAnswer != 3) {

            int number = rand.nextInt(100);
            int i = 2;
            boolean isPrime = true;

            System.out.print("Question: " + number);
            System.out.println(" Your answer: ");

            String answer = scanner.next();

            while (i < Math.ceil((float) number / 2)) {
                if (number % i != 0) {
                    i++;
                    continue;
                }
                isPrime = false;
                break;
            }

            if (isPrime && answer.equals("yes") || !isPrime && answer.equals("no")) {

                System.out.println("Correct!");
                countOfCorrectAnswer++;

            } else {

                String correctAnswer = answer.equals("yes") ? "no" : "yes";

                System.out.println("'" + answer + "'" + " is wrong answer ;(. "
                        + "Correct  answer was " + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, "  + "!");
                countOfCorrectAnswer = 0;

            }
        }
    }
}
