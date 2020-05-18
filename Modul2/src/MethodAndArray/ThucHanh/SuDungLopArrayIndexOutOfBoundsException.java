package MethodAndArray.ThucHanh;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SuDungLopArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0;i<array.length;i++) {
            array[i]= random.nextInt(100);
        }
        System.out.println("Random array: " + Arrays.toString(array));
        System.out.println("Enter index of element in array: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        try {
            System.out.println("Element at index "+ index +" is " + array[index]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Out off array lenght!");
        }

    }
}
