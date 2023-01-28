package util;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static int getNum() {
        return scanner.nextInt();
    }

    public static boolean yesNo() {
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }

    public static int getInt(int min, int max) {
        System.out.printf("Please input a number between %d and %d: ", min, max);
        int userNumber = 0;
        do {
            try {
                int userInput = Integer.parseInt(getString());
                if (userInput > min && userInput < max) {
                    userNumber = userInput;
                } else {
                    System.out.println("Please input a number between the given values.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
            };
        } while (userNumber == 0);
        return userNumber;
    }

    public static int getInt() {
        int userNumber = 0;
        try {
            userNumber = Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, please enter a number.");
        }
        return userNumber;
    }

    public static double getDouble(double min, double max) {
        System.out.printf("Please input a number between %s and %s: ", min, max);
        double userNumber = 0;
        do {
            try {
                double userInput = Double.parseDouble(getString());
                if (userInput > min && userInput < max) {
                    userNumber = userInput;
                } else {
                    System.out.println("Please input a number between the given values.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number.");
            };
        } while (userNumber == 0);
        return userNumber;
    }

    public static double getDouble() {
        return scanner.nextDouble();
    }
}