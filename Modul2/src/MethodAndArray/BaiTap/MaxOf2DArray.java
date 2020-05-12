package MethodAndArray.BaiTap;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class MaxOf2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if (size>10) System.out.println("Size should less than 10");
        }while (size>10);
        double[][] array = new double[size][size];
for (int i =0;i<array.length;i++){
            for (int j = 0;j<array[i].length;j++){
                System.out.println("Input array elements: "+i+j);
                array[i][j] = scanner.nextDouble();
            }
    }
        System.out.println("Max of array: "+max2DArray(array));
}
    public static double max2DArray(double[][] array){
        double max = array[0][0];
        for (int i =0;i<array.length;i++){
            for (int j = 0;j<array[i].length;j++){
                if (array[i][j]>max) max = array[i][j];
            }
        }
        return max;
    }

}
