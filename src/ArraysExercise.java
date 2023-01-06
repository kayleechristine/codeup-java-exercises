import java.util.Arrays;

public class ArraysExercise {

    public static Person[] addPerson(Person[] peopleArray, Person newPerson) {

        System.out.println("Adding a person to the group...");
        int length = peopleArray.length;
        Person[] newPeople = Arrays.copyOf(peopleArray, length + 1);
        newPeople[length] = newPerson;
        System.out.println(newPeople[length].getName() + " has been added.");
        return newPeople;

    }

    public static void main(String[] args) {

        System.out.println("\n**** Arrays Exercises ****");

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Without .toString(): " + numbers);
        // Printing the name of an array results in the return of the
        // instance of that array, not the contents. In order to view
        // the contents, you must use the .toString method to convert
        // the data to a String and print the result.
        System.out.println("With .toString(): " + Arrays.toString(numbers));

        System.out.println("\n**** People Array: ****");
        Person[] people = new Person[3];
        people[0] = new Person("Joshua");
        people[1] = new Person("Kaylee");
        people[2] = new Person("Rex");

        for (Person individual : people) {
            System.out.println(individual.getName());
        }

        System.out.println("\n**** Add a Person: ****");
        addPerson(people, new Person("Fido"));

    }
}
