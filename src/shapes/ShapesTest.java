package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Quadrilateral mySquare = new Square(2);
        mySquare.getPerimeter();
        mySquare.getArea();

        Quadrilateral myRectangle = new Rectangle(2, 4);
        myRectangle.getPerimeter();
        myRectangle.getArea();

///////// Inheritance & Polymorphism: /////////
//        Rectangle box1 = new Rectangle(5, 4);
//        box1.getArea();
//        box1.getPerimeter();
//
//        Rectangle box2 = new Square(5);
//        box2.getArea();
//        box2.getPerimeter();

    }
}