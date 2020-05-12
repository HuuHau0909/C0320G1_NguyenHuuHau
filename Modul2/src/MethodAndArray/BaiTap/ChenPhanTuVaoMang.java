package MethodAndArray.BaiTap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ChenPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Enter insert element: ");
        int element = scanner.nextInt();
        System.out.println("Enter insert index: ");
        int index = scanner.nextInt();
        for (int i = array.length - 1; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        System.out.println("New array: " + Arrays.toString(array));
    }
}
