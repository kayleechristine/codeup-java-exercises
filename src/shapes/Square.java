package shapes;

public class Square extends Quadrilateral implements Measurable {

    public Square(double side) {
        super(side);
    }

    public double setLength(double side) {
        System.out.println("\nThe square size has been updated.");
        this.length = side;
        this.width = side;
        getLength();
        getWidth();
        return side;
    }

    public double setWidth(double side) {
        System.out.println("\nThe square size has been updated.");
        this.length = side;
        this.width = side;
        getLength();
        getWidth();
        return side;
    }

///////// Inheritance & Polymorphism: /////////
//    protected double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getArea() {
//        double area = Math.pow(side, 4);
//        System.out.println("Square method is running...");
//        System.out.printf("Area: %s\n", area);
//        return area;
//    }
//
//    public double getPerimeter() {
//        double perimeter = side * 4;
//        System.out.println("Square method is running...");
//        System.out.printf("Perimeter: %s\n", perimeter);
//        return perimeter;
//    }

}