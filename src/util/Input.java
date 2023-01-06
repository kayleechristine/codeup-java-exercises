package util;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }

    public static int getInt(int min, int max) {
        int userNumber;
        do {
            System.out.printf("Please input a number between %d and %d: ", min, max);
            userNumber = scanner.nextInt();
        } while (userNumber > max || userNumber < min);
        return userNumber;
    }

    public static int getInt(){
        return scanner.nextInt();
    }

    public static double getDouble(double min, double max) {
        double userNumber;
        do {
            System.out.printf("Please input a number between %s and %s: ", min, max);
            userNumber = scanner.nextDouble();
        } while (userNumber > max || userNumber < min);
        return userNumber;
    }

    public static double getDouble() {
        return scanner.nextDouble();
    }

    public static void main(String[] args) {

        getInt(1, 10);
        getDouble(0.1, 0.5);

    }

}
