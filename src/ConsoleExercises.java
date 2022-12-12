import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args) {

        // Round Pi
        double pi = 3.14159;
        System.out.print("1.) The value of pi is approximately ");
        System.out.format("%.2f%n", pi);

        // Scanner Class
        Scanner scanner = new Scanner(System.in);

        // 1.
        System.out.print("2.) Enter an integer: ");
        int userInt = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInt + "\" <--");
        // When I input the string "Hello" instead of an integer, the compilation failed.

        // 2.
        System.out.print("3.) Enter three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.println("The first word is: " + firstWord);
        System.out.println("The second word is: " + secondWord);
        System.out.println("The third word is: " + thirdWord);
        // When I tried to enter two words only, the scanner paused a waited for the third input.
        // When I entered more than three words, the scanner only captured the first three and continued compiling.
        scanner.nextLine();

        // 3. & 4.
        System.out.print("4.) Enter a sentence: ");
        // String sentence = scanner.next();
        String sentence = scanner.nextLine();
        System.out.println(sentence);
        // If I used next, the scanner would only capture the first token and stop at the whitespace.
        // By using nextLine, the scanner captures the entire string regardless of whitespace.

        // Perimeter of Codeup Classrooms
        System.out.println("5.) What's the perimeter of the classroom?");
        System.out.print("Length: ");
        int length = scanner.nextInt();
        System.out.print("Width: ");
        int width = scanner.nextInt();
        int perimeter = (length * 2) + (width * 2);
        int area = length * width;
        System.out.println("The perimeter of the classroom is: " + perimeter + ".");
        System.out.println("The area of the classroom is: " + area + ".");

    }

}
