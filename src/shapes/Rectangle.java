package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double setLength(double length) {
        System.out.println("\nThe rectangle size has been updated.");
        this.length = length;
        getLength();
        return length;
    }

    public double setWidth(double width) {
        System.out.println("\nThe rectangle size has been updated.");
        this.width = width;
        getWidth();
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