package grades;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student("Griselda");
        System.out.println("Name: " + student.getName());
        student.addGrade(90, 85, 75, 96);
        student.getGradeAverage();

    }
}
