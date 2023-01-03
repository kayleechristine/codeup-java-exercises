package shapes;

public class Circle {

    private double radius;

    public Circle(double radius) {
        System.out.println("Radius: " + radius);
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        System.out.println("Area: " + area);
        return area;
    }

    public double getCircumference() {
        double circumference = Math.PI * this.radius * 2;
        System.out.println("Circumference: " + circumference);
        return circumference;
    }

    public static void main(String[] args) {

        Circle circle1 = new Circle(4);
        circle1.getArea();
        circle1.getCircumference();

    }

}
