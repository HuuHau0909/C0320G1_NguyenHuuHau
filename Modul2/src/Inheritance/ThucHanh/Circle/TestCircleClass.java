package Inheritance.ThucHanh.Circle;

public class TestCircleClass {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println(circle);
//        circle = new Circle(2.3, "red");
//        System.out.println(circle);
//        System.out.println(circle.getArea());
//        Cylinder cylinder = new Cylinder();
//        System.out.println(cylinder);
        Circle circle = new Cylinder(1);
        System.out.println(circle);
        System.out.println(circle.getArea());
    }
}
