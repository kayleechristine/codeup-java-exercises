public class ControlFlowExercises {

    public static void main(String[] args) {

        // 1. Loop Basics
        System.out.println("**** Loop Basics ****");

        // a. While Loop
        System.out.println("*** a) While Loop ***");
        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }

        // b. Do While Loops
        System.out.println("*** b) Do While Loops ***");

        System.out.println("** i. Create a do-while loop that will count by 2's starting with 0 and ending at 100. **");
        int a = 0;
        do {
            System.out.println(a);
            a += 2;
        } while (a <= 100);

        System.out.println("** ii. Alter your loop to count backwards by 5's from 100 to -10. **");
        int b = 100;
        do {
            System.out.println(b);
            b -= 5;
        } while (b >= -10);

        System.out.println("** iii. Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. **");
        int c = 2;
        do {
            System.out.println(c);
            c *= c;
        } while (c > 0);

        // c. For Loops
        System.out.println("*** c) For Loops ***");
        System.out.println("** Refactor the previous two exercises to use a for loop instead. **");

        for (int ii = 5; ii <= 15; ii++) {
            System.out.println(ii);
        }
        System.out.println("*****");

        for (int aa = 0; aa <= 100; aa += 2) {
            System.out.println(aa);
        }
        System.out.println("*****");

        for (int bb = 100; bb >= -10; bb -= 5) {
            System.out.println(bb);
        }
        System.out.println("*****");


    }

}
