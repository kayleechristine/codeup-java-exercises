public class Main {

    //main method shortcut
    //main(tab/enter)
    //psvm(tab/enter)
    //System.out.println shortcut
    //sout

    public static void main(String[] args) {

        // 1.
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        // 2.
        String myString = "Pineapple Pizza";
        System.out.println(myString);

        // 3.
        // char myString = "Pineapple Pizza";
        // System.out.println(myString);
        // A string can not be assigned to the char caste since they're incompatible types.

        // 4.
        // myString = 3.14159;
        // System.out.println(myString);
        // myString is already declared as a String. A decimal number should use the double data type.

        // 5.
         long myNumber;
        // System.out.println(myNumber);
        // The number was declared but not initialized, so the code could not be compiled.

        // 6.
        // myNumber = 3.14;
        // System.out.println(myNumber);
        // myNumber cannot be assigned a decimal number since it was declared as the long data type.

        // 7.
        myNumber = 123L;
        System.out.println(myNumber);
        // The code was compiled and returned 123, dropping the L on the end.

        // 8.
        myNumber = 123;
        System.out.println(myNumber);
        // myNumber can be assigned to a number because they have matching data types.

        // 9.
        // float myNumber = 3.14;
        // System.out.println(myNumber);
        // The compilation failed because myNumber is already defined with the long data type
        // and the number assigned is the long data type, not float.
        // We can use a different variable with the double data type and then assign 3.14:
        double applePi = 3.14;
        System.out.println(applePi);

        // 10.
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        // Here the code is printing x prior to the incrementation and returns 5. The next
        // time it prints x has been incremented, so it returns 6.
        int y = 5;
        System.out.println(++y);
        System.out.println(y);
        // Here the code is incrementing y prior to printing it, so the return is 6. When it
        // prints y next, there is no more incrementation, so it returns 6 again.

        // 11.
        // String class = "Codeup";
        // System.out.println(class);
        // Compilation failed due to class not being an authorized statement. Class is reserved.

        // 12.
        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;
        // In the above example, the object "o" is storing the string "three". The example then
        // attempts to convert o to an integer via casting. The below example tries to declare a
        // string as an integer directly.
        // int three = (int) "three";
        // The first example fails because casting cannot change the data type of the variable.
        // The second example fails because a string cannot be stored as a integer as they are
        // incompatible data types.

        // 13.
        int a = 4;
        a += 5; // a = a + 5;

        int b = 3;
        int c = 4;
        c *= b; // c = c * b;

        int d = 10;
        int e = 2;
        d /= e; // d = d / e;
        e -= d; // e = e - d;

        // 14.
        // If a variable is decremented or incremented past the min/max of it's assigned data type, the program
        // will not allow it to be changed. The variable will remain at the min/max range during compilation.
        // This is different from what I was expecting. I thought it would result in a compilation error.

    }

}
