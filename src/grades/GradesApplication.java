package grades;
import java.text.DecimalFormat;
import java.util.HashMap;
import static util.Input.getString;
import static util.Input.yesNo;

public class GradesApplication {

    // Decimal Formatting
    private static final DecimalFormat d2 = new DecimalFormat("0.00");

    public static void userInterface(HashMap<String, Student> students) {

        System.out.println("--------------------");
        System.out.format("%16s", "GRADE MANAGER");
        System.out.println("\n--------------------");

        System.out.println("[Student Info] [Class Overview] [Exit]");
        System.out.print("--------------------\nWhat would you like to do? ");
        String userInput = getString();

        if (userInput.equalsIgnoreCase("Student Info")) {
            studentInfo(students);
        } else if (userInput.equalsIgnoreCase("Class Overview")) {
            classOverview(students);
        } else {
            System.out.println("--------------------\nExiting...");
        }

    }

    public static void studentInfo(HashMap<String, Student> students) {
        String userInput;
        boolean yesNo;
        int num = 1;

        System.out.println("--------------------");
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
            System.out.println("Grades: " + students.get(userInput).getGrades());
            System.out.println("Grade: " + d2.format(students.get(userInput).getGradeAverage()));
        } else {
            System.out.println("--------------------");
            System.out.println("Username not found.");
        }

        System.out.print("--------------------\n" +
                "Would you like to see another student? ");

        yesNo = yesNo();
        if (yesNo) {
            studentInfo(students);
        } else {
            System.out.print("--------------------\n" +
                    "Would you like to return to the main menu? ");
            yesNo = yesNo();
            if (yesNo) {
                userInterface(students);
            } else {
                System.out.println("--------------------\nExiting...");
            }
        }
    }

    public static void classOverview(HashMap<String, Student> students) {

        int num = 1;
        double total = 0;

        System.out.println("--------------------");
        System.out.println("Class Overview:\n--------------------");

        System.out.format("%-3s %-10s %-22s %-10s %n", "#", "Name", "Assignments", "Grade");

        for (String username : students.keySet()) {
            String name = students.get(username).getName();
            String grade = d2.format(students.get(username).getGradeAverage());
            System.out.format("%-3s %-10s %-22s %-10s %n", (num + "."), name, students.get(username).getGrades(), grade);
            num++;
            total += students.get(username).getGradeAverage();
        }

        System.out.println("--------------------");
        System.out.format("Class Average: %s%n", d2.format(total / students.size()));

        System.out.print("--------------------\nWould you like to return to the main menu? ");
        boolean yesNo = yesNo();
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
