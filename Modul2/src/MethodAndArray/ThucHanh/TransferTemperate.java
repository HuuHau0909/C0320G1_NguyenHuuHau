package MethodAndArray.ThucHanh;

import java.util.Scanner;

public class TransferTemperate {
    public static void main(String[] args) {
        int choosen;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            choosen = input.nextInt();
            switch (choosen) {
                case 1:
                    System.out.println("Input Fahrenheit: ");
                    double f = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(f));
                    break;
                case 2:
                    System.out.println("Input Celsius: ");
                    double c = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(c));
                    break;
                case 3:
                    System.out.println("Exit program!");
                    System.exit(3);
                default:
                    System.out.println("Invailed input!");
                    break;
            }

        } while (true);
    }

    public static double fahrenheitToCelsius(double x) {
        double reusult = (5.0 / 9) * (x - 32);
        return reusult;
    }

    public static double celsiusToFahrenheit(double x) {
        double reusult = x / (5.0 / 9) + 32;
        return reusult;
    }
}
