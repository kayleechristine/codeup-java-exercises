package groceries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroceryList {

    // List Fields
    public String name;
    public ArrayList<String> categories = new ArrayList<>();
    public class Section {
        public String category;
        HashMap<String, Integer> list;

        // Section Constructor
        public Section(String category) {
            //System.out.println(category + " category added.");
            this.category = category;
            this.list = new HashMap<>();
            categories.add(category);
        }

        public void addItem(String item, Integer quantity) {
            System.out.format("%s (%s) added to the list.%n", item, quantity);
            list.put(item, quantity);
        }

        public void getSectionItems() {
            System.out.println("--------------------");
            System.out.format("%s%n", this.category.toUpperCase());
            System.out.print("--------------------\n");
            for (String item : this.list.keySet()) {
                System.out.format("%-2s %-10s %-5s%n", "-", item, this.list.get(item));
            }
        }
    }

    // Grocery List Constructor
    public GroceryList(String name) {
        //System.out.println(name + " has been created.");
        this.name = name;
    }

    // Methods
    public String getListName() {
        //System.out.println("List Name: " + this.name);
        return this.name;
    }

//
//    public void addGrade(double... scores) {
//        for (double score : scores) {
//            // System.out.println("Adding " + score + "...");
//            this.grade.add(score);
//        }
//    }
//
//    public ArrayList<Double> getGrades() {
//        // System.out.println("Grades: " + this.grade);
//        return this.grade;
//    }
//
//    public double getGradeAverage() {
//        double total = 0;
//        for (double score : this.grade) {
//            total += score;
//        }
//        double grade = total / this.grade.size();
//        // System.out.println("Grade: " + grade);
//        return grade;
//    }

    public static void main(String[] args) {

        GroceryList toBuy = new GroceryList("Grocery Run");
        toBuy.getListName();

        Section produce = toBuy.new Section("Produce");
        produce.addItem("Carrots", 3);
        produce.addItem("Cucumber", 2);
        produce.addItem("Apples", 4);
        // produce.getSectionItems(produce.list);

        Section meat = toBuy.new Section("Meat & Fish");
        meat.addItem("Salmon", 2);

    }

}