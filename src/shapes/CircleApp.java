package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        System.out.print("Input the radius of the circle: ");
        double radius = Input.getDouble();
        Circle circle1 = new Circle(radius);
        circle1.getCircumference();
        circle1.getArea();

    }

}
