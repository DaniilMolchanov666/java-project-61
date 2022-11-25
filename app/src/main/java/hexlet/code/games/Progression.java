package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {

    public static void progression() {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("What number is missing in the progression?");

        int countOfCorrectAnswer = 0;

        while (countOfCorrectAnswer != 3) {

            int number1 = rand.nextInt(100);
            int dif = rand.nextInt(100);
            int randomPosition = rand.nextInt(9);

            int[] array = new int[10];

            System.out.print("Question: " + " ");

            for (int i = 0; i < array.length; i++) {

                if (i == 0) {
                    array[i] = number1;

                } else {
                    number1 += dif;
                    array[i] += number1;
                }

                System.out.println(i == randomPosition ? ".. " : array[i] + " ");

            }

            System.out.println("Your answer: ");

            String tryNumber = sc.next();

            if (Integer.parseInt(tryNumber) == array[randomPosition]) {
                System.out.println("Correct!");
                countOfCorrectAnswer++;

            } else {

                System.out.println("'" + tryNumber + "'" + " is wrong answer ;(. "
                        + "Correct  answer was " + "'" + array[randomPosition] + "'.");
                System.out.println("Let's try again, " + "!");
                countOfCorrectAnswer = 0;

            }
        }
        System.out.println("Congratulation! U Win!");
    }
}


