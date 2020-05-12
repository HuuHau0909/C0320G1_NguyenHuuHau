package MethodAndArray.ThucHanh;

import java.util.Arrays;
import java.util.Scanner;

public class MethodMinValue {
    public static int minArrayValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter size of asset list: ");
            size = scanner.nextInt();
            if (size > 20) System.out.println("Size should less than 20");
        } while (size > 20);
        int[] assetList = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Input asset " + i);

            assetList[i] = scanner.nextInt();
            i++;
        }
        System.out.println("List asset " + Arrays.toString(assetList));
        int index = minArrayValue(assetList);
        System.out.println("Min of array: " + assetList[index]);
    }}