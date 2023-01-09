package grades;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student("Griselda");
        student.getName();
        student.addGrade(90);
        student.addGrade(85);
        student.addGrade(75);
        student.addGrade(96);
        student.getGradeAverage();

    }
}
