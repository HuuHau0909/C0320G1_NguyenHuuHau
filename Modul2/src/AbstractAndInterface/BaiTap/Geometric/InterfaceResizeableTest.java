package AbstractAndInterface.BaiTap.Geometric;

import AbstractAndInterface.BaiTap.Geometric.Circle;
import AbstractAndInterface.BaiTap.Geometric.Rectangle;
import AbstractAndInterface.BaiTap.Geometric.Shape;
import AbstractAndInterface.BaiTap.Geometric.Square;

public class InterfaceResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2,3);
        shapes[2] = new Square(3);
        for (Shape shape:shapes){
            if (shape instanceof Circle){
                System.out.println(((Circle) shape).getArea());
            }else  if (shape instanceof Rectangle){
                System.out.println(((Rectangle) shape).getArea());
            }else if (shape instanceof Square){
                System.out.println(((Square) shape).getArea());
            }
        }
        for (Shape shape:shapes){

            if (shape instanceof Circle){
                ((Circle) shape).resize(Math.random()*100);
            }else  if (shape instanceof Rectangle){
                ((Rectangle) shape).resize(Math.random()*100);
            }else if (shape instanceof Square){
                ((Square) shape).resize(Math.random()*100);
            }
        }
    }
}
