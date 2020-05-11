package Ngonngujava.Thuchanh;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        float sum = 0;
        int count, subjects = 10;
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter the marks for " + subjects + " subjects: ");
        for (count = 0; count < subjects; count++) {
            float mark;
            mark = input.nextFloat();
            if(mark < 0)
                break;
            sum += mark;
        }

        if(count >= subjects)
            System.out.print("Average mark = " + sum/subjects);
        else
            System.out.println("Error: Invalid mark!");
    }


}
