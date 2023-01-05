package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side);
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