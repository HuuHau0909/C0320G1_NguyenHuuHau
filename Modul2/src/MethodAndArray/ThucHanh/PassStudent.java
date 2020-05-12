package MethodAndArray.ThucHanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class PassStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfStudent;
        do {
            System.out.printf("Input number students: ");

            numOfStudent = scanner.nextInt();
            if (numOfStudent>30) System.out.println("Number of students should less than 30");
        }while (numOfStudent>30);
        double[] markArray = new double[numOfStudent];
        int count = 0;
        for (int i = 0;i<markArray.length;i++){
            System.out.println("Input mark of students: "+(i+1));
            markArray[i] = scanner.nextDouble();
            if (markArray[i]>=5) count++;
        }
        System.out.println("Number of students passed: "+count);
    }
}
