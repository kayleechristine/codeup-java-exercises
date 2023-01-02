import java.util.Random;
import java.util.Scanner;
public class MethodsExercises {

    public static int add(int a, int b) {
        int sum = a + b;
        System.out.printf("%s + %s = %s\n", a, b, sum);
        return sum;
    }

    public static int subtract(int a, int b) {
        int difference = a - b;
        System.out.printf("%s - %s = %s\n", a, b, difference);
        return difference;
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        System.out.printf("%s * %s = %s\n", a, b, product);
        return product;
    }

    public static int divide(int a, int b) {
        int quotient = a / b;
        System.out.printf("%s / %s = %s\n", a, b, quotient);
        return quotient;
    }

    public static int modulus(int a, int b) {
        int remainder = a % b;
        System.out.printf("%s %% %s = %s\n", a, b, remainder);
        return remainder;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        do {
            System.out.printf("Please input a number between %d and %d: ", min, max);
            String userInput = scanner.nextLine();
            userNumber = Integer.parseInt(userInput);
        } while (userNumber > max || userNumber < min);
        return userNumber;
    }

    public static long factorial(int num) {
        int count = 1;
        String math = "1";
        int result = 1;

        if (num == 1) {
            System.out.printf("%d! = %s = %d\n", num, math, result);
        } else {
            do {
                result *= (count + 1);
                count += 1;
                math = math + " x " + count;
            } while (count < num);
            System.out.printf("%d! = %s = %d\n", num, math, result);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to continue (Y/N)? ");
        String continueFactorial = scanner.nextLine();

        if (continueFactorial.equals("Y")) {
            factorial(getInteger(1, 10));
        }

        return result;
    }

    public static int rollDie() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many sides are on the die? ");
        int max = Integer.parseInt(scanner.nextLine());

        Random roll = new Random();
        int rollResult = roll.nextInt((max - 1) + 1) + 1;
        System.out.println(rollResult);

        System.out.print("Would you like to roll again (Y/N)? ");
        String continueRolling = scanner.nextLine();

        if (continueRolling.equals("Y")) {
            rollDie();
        }

        return rollResult;
    }

    public static void main(String[] args) {

        System.out.println("\n***** 1. Basic Arithmetic");

        System.out.println("***** Addition");
        add(1, 1);

        System.out.println("***** Subtraction");
        subtract(4, 2);

        System.out.println("***** Multiplication");
        multiply(2, 8);

        System.out.println("***** Division");
        divide(16, 4);

        System.out.println("***** Modulus");
        modulus(21, 5);

        System.out.println("\n**** 2. Min & Max");
        getInteger(1, 20);

        System.out.println("\n**** 3. Number Factorials");
        factorial(getInteger(1, 10));

        System.out.println("\n**** 4. Dice Rolling");
        rollDie();

        System.out.println("\n**** 5. Game Development 101");
        System.out.println("Continued in the HighLow java class!");





    }

}
