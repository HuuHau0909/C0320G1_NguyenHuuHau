package MethodAndArray.ThucHanh;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocPhanTuMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter size");
            size = scanner.nextInt();
            if (size>20) System.out.println("Size should less than 20");
        }while (size>20);
        double[] assetList = new double[size];
        int i = 0;
        while (i < size) {
            System.out.println("Input asset " + i);

            assetList[i] = scanner.nextDouble();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (double v : assetList) {
            System.out.print(v + "\t");
        }
        for (int j=0;j<assetList.length/2;j++){
            double temp = assetList[j];
            assetList[j]=assetList[size-1-j];
            assetList[size-1-j]=temp;
        }
        System.out.println("Reverse array: "+ Arrays.toString(assetList));
    }
}
