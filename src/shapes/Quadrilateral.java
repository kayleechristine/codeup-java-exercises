package shapes;

public abstract class Quadrilateral implements Measurable {

    protected double length;
    protected double width;

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

    public abstract double getArea();
    public abstract double getPerimeter();

}
