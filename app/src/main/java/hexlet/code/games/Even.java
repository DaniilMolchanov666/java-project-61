package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;
public class Even {

    public static void gameTwo() {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int countOfCorrectAnswer = 0;

        while (countOfCorrectAnswer != 3) {

            int number = rand.nextInt(1000);

            System.out.print("Question: " + number);
            System.out.println(" Your answer: ");

            String tryNumber = sc.next();

            if (!(tryNumber.equals("yes") || tryNumber.equals("no"))) {      // проверка введен ли ответ "да" или "нет"
                System.out.println("Please enter \"yes\" or \"no\"");
                countOfCorrectAnswer = 0;
                continue;
            }

            if (number % 2 == 0 && tryNumber.equals("yes")
                        || (number % 2 != 0 && tryNumber.equals("no"))) {    // проверка корректный ли ответ
                System.out.println("Correct!");
                countOfCorrectAnswer++;
                continue;
            }

            String correctAnswer = tryNumber.equals("yes") ? "no" : "yes";  // вывод правильного ответа при ошибке
            System.out.println("'" + tryNumber + "'" + " is wrong answer ;(. "
                    + "Correct  answer was " + "'" + correctAnswer + "'.");
            System.out.println("Let's try again, "  + "!");
            countOfCorrectAnswer = 0;

        }

        System.out.println("Congratulation! U Win!");

    }

}
