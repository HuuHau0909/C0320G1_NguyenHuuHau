package Ngonngujava.TestCode;

import java.util.Scanner;

public class TestBreak {
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

    public static class test {
        public static void main(String[] args) {
            double money = 1.0;
            int month = 1;
            double interset_rate = 1.0;

            Scanner input = new Scanner(System.in);
            System.out.println("Money: ");
            money = input.nextDouble();
            System.out.println("Time (month): ");
            month = input.nextInt();
            System.out.println("Interest rate: ");
            interset_rate = input.nextDouble();

            double total_interset = 0;
            for (int i = 0; i < month; i++) {
                total_interset = money * (interset_rate / 100) / 12 * month;
            }

            System.out.println("Total interset: " + total_interset);
        }
    }
}
