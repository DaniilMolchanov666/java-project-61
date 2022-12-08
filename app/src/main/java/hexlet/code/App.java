package hexlet.code;

public class App {

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet" + "\n" + "2 - Even" + "\n" + "3 - Calculator"
                + "\n" + "4 - GreatestCommonDivision" + "\n" + "5 - Progression" + "\n" + "6 - Prime"
                + "\n" + "0 - Exit"
                + "\n" + "Your choice: ");

        ChooseGameMenu.chooseGame();

    }
}
