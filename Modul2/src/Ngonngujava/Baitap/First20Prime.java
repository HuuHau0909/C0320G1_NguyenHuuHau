package Ngonngujava.Baitap;

import java.util.Scanner;

public class First20Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of prime: ");
        int number = input.nextInt();

        int count = 0;
        int i = 2;

        while (count < number) {
            if (checkPrime(i)){
                System.out.println("So nguyen to thu "+(count+1)+" la " +i);
                count++;
            }
            i++;
        }
    }

    public static boolean checkPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}
