package hexlet.code;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet" + "\n" + "2 - Even" + "\n" + "0 - Exit" + "\n" + "Your choice: ");

        int select = sc.nextInt();

        switch (select) {

            case 1:

                Cli.greeting();
                break;

            case 2:

                String name = Cli.greeting();
                Even.gameTwo(name);
                break;

            default:

                System.out.println("Buy! See you later!");
                break;

        }

    }
}
