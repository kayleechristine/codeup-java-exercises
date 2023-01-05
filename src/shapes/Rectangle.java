package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        System.out.println("Creating a rectangle...");
        setLength(length);
        setWidth(width);
        System.out.println("A rectangle was created.");
    }

    public Rectangle(double side) {
        System.out.println("Creating a square...");
        setLength(side);
        setWidth(side);
        System.out.println("A square was created.");
    }

    public double getArea() {
        double area = this.length * this.width;
        System.out.println("Area: " + area);
        return area;
    }

    public double getPerimeter() {
        double perimeter = (this.length * 2) + (this.width * 2);
        System.out.println("Perimeter: " + perimeter);
        return perimeter;
    }

    public double setLength(double length) {
        System.out.println("Length: " + length);
        this.length = length;
        return length;
    }

    public double setWidth(double width) {
        System.out.println("Width: " + width);
        this.width = width;
        return width;
    }

///////// Inheritance & Polymorphism: /////////
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        System.out.println("A new Rectangle was created.");
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        double area = this.length * this.width;
//        System.out.println("Rectangle method is running...");
//        System.out.printf("Area: %s\n", area);
//        return area;
//    }
//
//    public double getPerimeter() {
//        double perimeter = (this.length * 2) + (this.width * 2);
//        System.out.println("Rectangle method is running...");
//        System.out.printf("Perimeter: %s\n", perimeter);
//        return perimeter;
//    }

}