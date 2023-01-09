package grades;
import java.util.HashMap;
import static util.Input.getString;
import static util.Input.yesNo;

public class GradesApplication {

    public static void userInterface(HashMap<String, Student> students) {

        String userInput;
        boolean yesNo;
        int num = 1;

        System.out.println("\nGRADE MANAGER\n--------------------");
        System.out.println("Student Usernames:\n--------------------");

        for (String username : students.keySet()) {
            System.out.println(num + ". " + username);
            num++;
        }

        System.out.print("--------------------\nSearch for Student Info: ");
        userInput = getString();

        if (students.containsKey(userInput)) {
            System.out.println("--------------------");
            System.out.println("Name: " + students.get(userInput).getName());
            System.out.println("Username: " + userInput);
            System.out.println("Grade: " + students.get(userInput).getGradeAverage());
            System.out.println("--------------------\n" +
                    "Would you like to see another student?");
        } else {
            System.out.println("--------------------");
            System.out.println("Username not found.");
            System.out.println("--------------------\n" +
                    "Would you like to see another student?");
        }

        yesNo = yesNo();
        if (yesNo) {
            userInterface(students);
        } else {
            System.out.println("--------------------\nExiting...");
        }

    }

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        students.put("quackquack", new Student("Codey"));
        students.put("debug.queen", new Student("Griselda"));
        students.put("totallynotabot7562", new Student("Rex"));
        students.put("average-joe", new Student("Joe"));

        students.get("quackquack").addGrade(89, 94, 92);
        students.get("debug.queen").addGrade(76, 80, 84);
        students.get("totallynotabot7562").addGrade(100, 100, 100);
        students.get("average-joe").addGrade(70, 75, 73);

        userInterface(students);

    }
}
