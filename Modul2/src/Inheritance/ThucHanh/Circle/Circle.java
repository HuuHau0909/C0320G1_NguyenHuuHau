package Inheritance.ThucHanh.Circle;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(String red, boolean b, double v) {
    }

    public Circle(int i) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI*Math.pow(getRadius(),2);
    }

    @Override
    public String toString() {
        return " A Circle with radius = " + getRadius()+" and color: "+ getColor() ;
    }
}
