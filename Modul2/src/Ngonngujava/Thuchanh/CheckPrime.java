package Ngonngujava.Thuchanh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        int checkNum = scanner.nextInt();
        if (checkNum < 2) {
            System.out.printf("%d isn't Prime", checkNum);
        } else {
            int i = 2;
            boolean check = true;
            for (i=2; i <= Math.sqrt(checkNum); i++){
                if (checkNum % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(checkNum + " is Prime");
            } else {
                System.out.println(checkNum + "isn't Prime");
            }
        }
    }
}
