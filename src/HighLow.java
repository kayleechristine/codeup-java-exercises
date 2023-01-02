import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static int numberGame() {

        Random roll = new Random();
        int rollResult = roll.nextInt((100 - 1) + 1) + 1;
        // System.out.println(rollResult);
        int userGuess;
        int numGuesses = 0;

        do {
            numGuesses += 1;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Guess a number between 1 and 100: ");
            String userInput = scanner.nextLine();
            userGuess = Integer.parseInt(userInput);

            if (userGuess < rollResult) {
                System.out.printf("**** HIGHER\n**** %d Guess(es) Remaining\n", 10 - numGuesses);
            } else if (userGuess > rollResult) {
                System.out.printf("**** LOWER\n**** %d Guess(es) Remaining\n", 10 - numGuesses);
            }

        } while (userGuess != rollResult && numGuesses < 10);

        if (userGuess == rollResult) {
            System.out.println("**********************************\nCongratulations! You won the game!\n**********************************");
        } else {
            System.out.println("**********************************\nYou lost... Better luck next time.\n**********************************");
        }

        return userGuess;

    }

    public static void main(String[] args) {

        System.out.println("\n**** 5. Game Development 101");
        numberGame();

    }

}
