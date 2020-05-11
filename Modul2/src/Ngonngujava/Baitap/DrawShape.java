package Ngonngujava.Baitap;

import java.util.Scanner;

public class DrawShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square triangle");
        System.out.println("3. Draw the isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        while (true) {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i <3; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <10; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
//                    for (int i = 0; i <10; i++) {
//                        for (int j = 0; j < 10-i; j++) {
//                            System.out.print("*");
//                        }
//                        System.out.println();
//                    }
//                    break;
                case 3:
                    final int row = 5;
                        String result = "";
                        String space = "";
                        String character = "";
                        int line = 1;
                        while (line<=row){
                            space = "";
                            character="";
                            for (int s = 1;s<=row-line;s++) space+="  ";
                            for (int c = 1; c<=2*line-1;c++) character+="* ";
                            result+=space+character+"\n";
                            line++;
                        }
                    System.out.println(result);
                    break;
                case 4:
                    System.out.println("Bye bye!");
                    System.exit(4);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
