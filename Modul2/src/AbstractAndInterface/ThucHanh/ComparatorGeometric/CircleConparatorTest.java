package AbstractAndInterface.ThucHanh.ComparatorGeometric;

import Inheritance.ThucHanh.Shape.Circle;

import java.util.Arrays;
import java.util.Comparator;

class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[4];
        circles[0] = new Circle(4.2);
        circles[1] = new Circle();
        circles[2] = new Circle("red",true,4.2);
        circles[3] = new Circle("Blue",false,3.6);

        System.out.println("Pre_sort");
        for (Circle circle:circles){
            System.out.println(circle);
        }
        Comparator circleComparator  = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After_sort");
        for (Circle circle:circles){
            System.out.println(circle);
        }
    }
}
