package ClassAndObject.Thuchanh;

import java.util.Scanner;

 public class ClassRectangle {
    double width;
    double height;

   public ClassRectangle() {
    }

    public ClassRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    String display () {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public  static class Ex_1 {
        public  static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ClassRectangle rectangle1 = new ClassRectangle();
            System.out.println("display"+rectangle1.display());
            System.out.println("Input Width: ");
            double width = scanner.nextDouble();
            System.out.println("Input height: ");
            double height = scanner.nextDouble();
            ClassRectangle rectangle = new ClassRectangle(width,height);
            System.out.println("Area: "+ rectangle.getArea()+"\n"+"Perimeter: "+rectangle.getPerimeter());

            System.out.println("Display: "+rectangle.display());
        }

    }
}
