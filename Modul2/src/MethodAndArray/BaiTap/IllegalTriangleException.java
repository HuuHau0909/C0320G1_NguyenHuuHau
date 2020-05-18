package MethodAndArray.BaiTap;

import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        float a = scanner.nextFloat();
        System.out.println("Input b");
        float b = scanner.nextFloat();
        System.out.println("Input c");
        float c = scanner.nextFloat();
        System.out.println("3 Side of triangle: " +a+b+c);
    }

}
