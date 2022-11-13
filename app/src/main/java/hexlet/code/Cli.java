package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Cli {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    String name;


    public void greeting(){

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = sc.next();
        this.name = name;
        System.out.println("\n" + "Hello, " + name + "!");

    }

    public boolean isEven() {

        int number = rand.nextInt(1000);
        System.out.print("Question: " + number);

        System.out.println(" Your answer: ");
        String tryNumber = sc.next();

        if (number % 2 == 0 && tryNumber.equals("yes") || (number % 2 != 0 && tryNumber.equals("no"))) {
            return true;
        }

        String correctAnswer = tryNumber.equals("yes") ? "no": "yes";

            System.out.println("'" + tryNumber + "'" + " is wrong answer ;(. " +
                    "Correct  answer was " + "'" + correctAnswer + "'" + " .");
            System.out.println("Let's try again, " + this.name + "!");
            return false;

    }

    public static void gameField() {

        Cli cli = new Cli();
        int select = sc.nextInt();

        cli.greeting();

        switch(select){

            case 1:

                cli.greeting();
                break;

            case 2:

                boolean isCorrect = false;

                do {

                    if (cli.isEven()) {
                        System.out.println("Correct!");
                        isCorrect = true;
                    }

                }
                while (!isCorrect);

                break;

            default:

                break;


        }

    }
}
