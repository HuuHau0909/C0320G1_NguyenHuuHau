package Inheritance.ThucHanh.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        // // Test Shape
        //        Shape shape = new Shape();
//        System.out.println(shape);
//        Shape shape1 = new Shape("Red",false);
//        System.out.println(shape1);
//         //Test Circle
//        Circle circle = new Circle();
//        System.out.println(circle);
//        circle = new Circle("Blue", true, 2);
//        System.out.println(circle);
        // Test Square
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.5);
        System.out.println(square);
        square = new Square("red",false,3);
        System.out.println(square);
    }
}
