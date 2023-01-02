import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static int numberGame() {

        Random roll = new Random();
        int rollResult = roll.nextInt((100 - 1) + 1) + 1;
        System.out.println(rollResult);
        int userGuess;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Guess a number between 1 and 100: ");
            String userInput = scanner.nextLine();
            userGuess = Integer.parseInt(userInput);

            if (userGuess < rollResult) {
                System.out.println("**** HIGHER");
            } else
                System.out.println("**** LOWER");

        } while (userGuess != rollResult);

        System.out.println("**********************************\nCongratulations! You won the game!\n**********************************");
        return userGuess;

    }

    public static void main(String[] args) {

        System.out.println("\n**** 5. Game Development 101");
        numberGame();

    }

}
