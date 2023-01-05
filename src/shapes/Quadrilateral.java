package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        System.out.println("Creating a rectangle...");
        this.length = length;
        this.width = width;
        getLength();
        getWidth();
    }

    public Quadrilateral(double side) {
        System.out.println("Creating a square...");
        this.length = side;
        this.width = side;
        getLength();
        getWidth();
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

    public double getLength() {
        System.out.println("Length: " + length);
        return length;
    }

    public double getWidth() {
        System.out.println("Width: " + width);
        return width;
    }

    public abstract double setLength(double length);
    public abstract double setWidth(double width);

}
