package MethodAndArray.ThucHanh;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter size of asset list: ");
            size = scanner.nextInt();
            if (size > 20) System.out.println("Size should less than 20");
        } while (size > 20);
        double[] assetList = new double[size];
        int i = 0;
        while (i < size) {
            System.out.println("Input asset " + i);

            assetList[i] = scanner.nextDouble();
            i++;
        }
        System.out.println("List asset " + Arrays.toString(assetList));
        double max = assetList[0];
        int index = 0;
        for (int j = 0; j < assetList.length; j++) {
            if (assetList[j] > max) {
                max = assetList[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
