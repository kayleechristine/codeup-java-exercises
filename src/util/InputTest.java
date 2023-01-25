package util;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args){

        // Testing getString()
        System.out.print("Shout into the void: ");
        System.out.println("Echo: " + Input.getString());

        // Testing yesNo()
        System.out.print("Do you like doggos? ");
        boolean answer = Input.yesNo();
        if (answer) {
            System.out.println("Me too, they're the goodest of puppers.");
        } else {
            System.out.println("You're wrong, but okay.");
        }

        // Testing getInt()
        System.out.println("What's your favorite number of the following?");
        int favNum = Input.getInt(1, 10);
        if (favNum == 7) {
            System.out.println("Hey, mine too!");
        } else {
            System.out.println(favNum + " is a good number.");
        }

        // Testing double()
        System.out.print("How much do you pay monthly for bubblegum? ");
        double bubblegumExpenditure = Input.getDouble();
        if (bubblegumExpenditure > 5) {
            System.out.println("$" + bubblegumExpenditure + "0 is way too much. Please seek help.");
        } else {
            System.out.println("Not bad, $" + bubblegumExpenditure + "0 seems reasonable.");
        }

    }
}
