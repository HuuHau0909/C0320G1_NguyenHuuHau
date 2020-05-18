package Inheritance.ThucHanh.Point;

public class PointMain {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,3);
        System.out.println(point2D);
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        Point2D point2D1 = new Point3D(1,2,9);
        System.out.println(point2D1);
        if(point2D instanceof Point3D){
            System.out.println(point2D1);
        }else {
            System.out.println("off");
        };
    }
}
