package Ngonngujava.TestCode;

import java.util.Scanner;

public class TestFor {
    public static void main(String[] args) {
        float sum  = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Emter total number of students");
        int totalNum = input.nextInt();
        System.out.println("Enter marks:");
        for (int count = 0;count<totalNum;count++) {
            float mark = input.nextFloat();
            sum += mark;
        }
        System.out.println("Average mark: "+sum/totalNum);
    }
}
