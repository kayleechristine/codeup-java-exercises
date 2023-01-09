package grades;
import java.util.ArrayList;

public class Student {
    // Private Name & Grade
    private String name;
    private ArrayList<Double> grade;

    // Student Constructor
    public Student(String name) {
        System.out.println(name + " has been added to the class.");
        this.name = name;
        this.grade = new ArrayList<>();

    }

    // Methods
    public String getName() {
        System.out.println("Name: " + this.name);
        return this.name;
    }

    public void addGrade(double score) {
        System.out.println("Got a " + score + " on the assignment!");
        this.grade.add(score);
    }

    public double getGradeAverage() {
        double total = 0;
        for (double score : this.grade) {
            total += score;
        }
        double grade = total / this.grade.size();
        System.out.println("Grade: " + grade);
        return grade;
    }

}
