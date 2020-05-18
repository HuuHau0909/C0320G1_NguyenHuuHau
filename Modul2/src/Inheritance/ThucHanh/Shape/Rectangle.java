package Inheritance.ThucHanh.Shape;

public class Rectangle extends Shape {
    private double width = 1;
    private double length = 1;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return getLength()*getWidth();
    }
    public double getPerimeter(){
        return (getLength()+getWidth())*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+getWidth()+ " and length= " +getLength()+", which is a subclass of" +super.toString();
    }
}
