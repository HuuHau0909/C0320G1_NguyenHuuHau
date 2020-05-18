package ClassAndObject.BaiTap;

import java.util.Scanner;

public class ActionQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = scanner.nextDouble();
        System.out.println("Input b: ");
        double b = scanner.nextDouble();
        System.out.println("Input c: ");
        double c = scanner.nextDouble();
        QuadraticEquation action = new QuadraticEquation(a, b, c);
            double delta = action.getDiscriminant();
            System.out.println("Delta: "+ delta);
            if (delta>0){
                System.out.println("Root1: "+ action.getRoot1()+"\n"+"Root2"+action.getRoot2());
            } else if (delta==0){
                System.out.println("Root1 = Root2 ="+action.getRoot1());
            }else {
                System.out.println("The equation has no root");
            }
    }

}
