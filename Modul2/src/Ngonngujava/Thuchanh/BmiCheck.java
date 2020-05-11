package Ngonngujava.Thuchanh;

import java.util.Scanner;

public class BmiCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Weight (kg): ");
        double weight = input.nextDouble();
        System.out.println("Enter Height (m): ");
        double height = input.nextDouble();
        double bmi = weight / height / height;
        if (weight <= 0 || height <= 0) {
            System.out.println("Invailded input!");
        } else {
            if (bmi < 18.5) System.out.println("Underweight!");
            else if (bmi < 25) System.out.println("Normal!");
            else if (bmi < 30) System.out.println("Overweight!");
            else if (bmi >= 30) System.out.println("Obese!");
        }
    }
}
