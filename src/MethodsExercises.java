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

    public static void main(String[] args) {

        System.out.println("***** 1. Basic Arithmetic \n");

        System.out.println("***** Addition");
        add(1, 1);

        System.out.println("***** Subtraction");
        subtract(4, 2);

        System.out.println("***** Multiplication");
        System.out.println("***** Division");

    }

}
