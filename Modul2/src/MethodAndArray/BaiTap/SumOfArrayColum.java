package MethodAndArray.BaiTap;


import java.util.Scanner;

public class SumOfArrayColum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int column;
        do {
            System.out.println("Enter row: ");
            row = scanner.nextInt();
            System.out.println("Enter colum: ");
            column = scanner.nextInt();
            if (row > 10 || column > 10) System.out.println("Size should less than 10");
        } while (row > 10 || column > 10);
        double[][] array = new double[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Input array elements: " + i + j);
                array[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Enter column index:");
        int indexColumn = scanner.nextInt();
        int sumIndexColumn = 0;
//        for (int i = 0; i < array[i].length; i++) {
        for (double[] doubles : array) {
            sumIndexColumn += doubles[indexColumn];
//            System.out.println("Sum of column " + indexColumn + " is " + sumIndexColumn);
        }
        System.out.println("Sum of column "+indexColumn+" is "+sumIndexColumn);

    }
}