import java.util.Scanner;
public class Bob {

    public static void main(String[] args) {

        // Creates the Scanner
        Scanner scanner = new Scanner(System.in);

        // Captures the user input
        System.out.print("You: ");
        String talkToBob = scanner.nextLine();

        // Bob's responses
        if (talkToBob.endsWith("?")) {
            System.out.println("Bob: Sure.");
        } else if (talkToBob.endsWith("!")) {
            System.out.println("Bob: Whoa, chill out!");
        } else if (talkToBob.equals("")) {
            System.out.println("Bob: Fine, be that way!");
        } else {
            System.out.println("Bob: Whatever.");
        }

    }

}
